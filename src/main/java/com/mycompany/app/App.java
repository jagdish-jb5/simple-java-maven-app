package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello JBee ";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private final String getMessage() {
        return message;
    }

}
