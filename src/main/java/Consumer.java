import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
import default_package.FrontEndClinica;
import default_package.IOException_Exception;
import default_package.MalformedURLException_Exception;
import default_package.NotBoundException_Exception;

public class Consumer {

    public static void main(String[] args) 
            throws NotBoundException_Exception, MalformedURLException_Exception, IOException_Exception {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/CD_FrontEnd_Soap/services/FrontEnd_ClinicaPort");
        factory.setServiceClass(FrontEndClinica.class);

        Object client = factory.create();
        Scanner scanner = new Scanner(System.in);
        

        

        while (true) { // Loop externo para operação contínua
            String clientIDString = "0";

            // Loop para login/registro
            while (clientIDString.equals("0")) {
                System.out.println("1. Login");
                System.out.println("2. Registar");

                int escolha = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                if (escolha == 1) {
                    // Lógica de login
                    while (clientIDString.equals("0")) {
                        System.out.println("Insira o nome de usuário: ");
                        String username = scanner.nextLine();
                        System.out.println("Insira a senha: ");
                        String pass = scanner.nextLine();

                        clientIDString = ((FrontEndClinica) client).autenticar(username, pass);
                        if (clientIDString.equals("0")) {
                            System.out.println("Credenciais inválidas. Tente novamente.");
                        }
                    }
                    System.out.println("Login bem-sucedido! ID do cliente: " + clientIDString);

                } else if (escolha == 2) {
                    // Lógica de registro
                    String registado = "Usuário já existe!";
                    while (registado.equals("Usuário já existe!")) {
                        System.out.println("Insira o nome de usuário: ");
                        String username = scanner.nextLine();
                        System.out.println("Insira a senha: ");
                        String pass = scanner.nextLine();

                        registado = ((FrontEndClinica) client).registar(username, pass);
                        if (registado.equals("Usuário já existe!")) {
                            System.out.println("Erro: Usuário já existe! Tente novamente.");
                        }
                    }
                    System.out.println("Registro bem-sucedido! Por favor, faça login.");
                    continue; // Retorna ao login após registro
                } else {
                    System.out.println("Opção inválida! Por favor, escolha 1 (Login) ou 2 (Registar).");
                }
            }

            Integer clientID = 0;
            try {
                clientID = Integer.valueOf(clientIDString); // Converte String para Integer
                System.out.println("ID do cliente: " + clientID);
            } catch (NumberFormatException e) {
                System.out.println("Formato de ID do cliente inválido: " + clientIDString);
                continue; // Retorna ao loop de login/registro
            }

            // Loop do menu principal
            while (clientID != 0) {
                System.out.println("\n--- Menu SOAP Cliente ---");
                System.out.println("1. Listar Consultas");
                System.out.println("2. Marcar Consulta");
                System.out.println("3. Cancelar Consulta");
                System.out.println("4. Sair");
                System.out.print("\n");
                System.out.print("Escolha uma opção: ");

                int escolha = scanner.nextInt();
                scanner.nextLine();
                
             

                switch (escolha) {
                    case 1:
                        try {
                            String resposta = ((FrontEndClinica) client).listarConsultasServer(clientID);
                            System.out.println(resposta);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        // Lógica para marcar consulta
                        System.out.println("Insira o dia: ");
                        int dia = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Insira o mês: ");
                        int mes = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Insira o ano: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Insira a hora: ");
                        int hora = scanner.nextInt();
                        scanner.nextLine();

                        try {
                            String clinicas = ((FrontEndClinica) client).listarClinicasServer();
                            System.out.println(clinicas);

                            System.out.println("Insira o ID da clínica: ");
                            int clinicaID = scanner.nextInt();
                            scanner.nextLine();
                            
                            String cord = ((FrontEndClinica) client).locClinica(clinicaID);
                            String[] parts = cord.split(";");
                            double latitude = Double.parseDouble(parts[0]);
                            double longitude = Double.parseDouble(parts[1]);
                            openGoogleMapsInBrowser(latitude, longitude);


                            String especialidades = ((FrontEndClinica) client).listarEspecialidadesServer(clinicaID);
                            System.out.println(especialidades);

                            System.out.println("Insira o ID da especialidade: ");
                            int especialidadeID = scanner.nextInt();
                            scanner.nextLine();

                            String resposta = ((FrontEndClinica) client).marcarConsultasServer(dia, mes, ano, hora, clientID, clinicaID, especialidadeID);
                            System.out.println(resposta);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 3:
                        // Lógica para cancelar consulta
                        try {
                            String consultas = ((FrontEndClinica) client).listarConsultasServer(clientID);
                            System.out.println(consultas);

                            System.out.println("Insira o número Consulta a cancelar: ");
                            int consultaID = scanner.nextInt();
                            scanner.nextLine();

                            String resposta = ((FrontEndClinica) client).removerConsultaServer(consultaID, clientID);
                            System.out.println(resposta);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        clientID = 0; // Reseta o ID do cliente para sair
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        
                        
                        
                        
                }
            }
        }
    }
    
    
    public static void openGoogleMapsInBrowser(double latitude, double longitude) {
        try {
            String googleMapsUrl = "https://www.google.com/maps?q=" + latitude + "," + longitude + "&hl=en";
            URI uri = new URI(googleMapsUrl);
            Desktop.getDesktop().browse(uri);  // Open the URL in the default browser
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}
