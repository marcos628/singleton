
public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();


        config.setServerUrl("http://miapi.com");
        config.setPort(9090);


        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Número de Puerto: " + config.getPort());
    }
}