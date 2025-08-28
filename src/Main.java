import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n Escolha uma opção!");
            System.out.println("1- Musica");
            System.out.println("2- Telefone");
            System.out.println("3- Navegar");
            System.out.println("0- Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    int opcaoMusica;
                    do {
                        System.out.println("Musica");
                        System.out.println("1- Tocar");
                        System.out.println("2- Pausar");
                        System.out.println("3- Selecionar música");
                        System.out.println("0- Voltar");
                        opcaoMusica = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoMusica) {
                            case 1:
                                iphone.tocar();
                                break;
                            case 2:
                                iphone.pausar();
                                break;
                            case 3:
                                System.out.println("Digite o nome da musica:");
                                String musica = scanner.nextLine();
                                iphone.selecionarMusica(musica);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida");
                        }
                    } while (opcaoMusica != 0);
                    break;

                case 2:
                    int opcaoTelefone = 0;
                    do {
                        System.out.println("Telefone");
                        System.out.println("1- Ligar");
                        System.out.println("2- Atender");
                        System.out.println("3- Iniciar correio de voz");
                        System.out.println("0- Voltar");
                        opcaoTelefone = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoTelefone) {

                            case 1:
                                System.out.println("Digite o numero que deseja ligar:");
                                String ligar = scanner.nextLine();
                                iphone.ligar(ligar);
                                break;
                            case 2:
                                iphone.atender();
                                break;
                            case 3:
                                iphone.iniciarCorreioVoz();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção invalida");
                                break;
                        }
                    } while (opcaoTelefone != 0);
                    break;

                case 3:
                    int opcaoNavegador;
                    do {
                        System.out.println("\n Navegador");
                        System.out.println("1- Exibir página");
                        System.out.println("2- Nova aba");
                        System.out.println("3- Atualizar página");
                        System.out.println("0- Voltar");
                        opcaoNavegador = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoNavegador) {
                            case 1:
                                System.out.println("Digite a url: ");
                                String url = scanner.nextLine();
                                iphone.exibirPagina(url);
                                break;
                            case 2:
                                iphone.adicionarNovaAba();
                                break;
                            case 3:
                                iphone.atualizarPagina();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção invalida");
                                break;
                        }
                    } while (opcaoNavegador != 0);
                    break;

                case 0:
                    System.out.println("Saindo..");
                    scanner.nextLine();
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
        scanner.close();

    }
}
