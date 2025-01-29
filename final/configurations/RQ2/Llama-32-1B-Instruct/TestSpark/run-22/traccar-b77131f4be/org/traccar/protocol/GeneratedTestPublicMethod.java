package org.traccar.protocol;

public class GeneratedTestPublicMethod {

    public static String publicMethod() {
        return "Hello from public method";
    }

    @Test
    public void testPublicMethod() throws Exception {
        String socketAddress = "192.168.1.1";
        int port = 12345;

        // Create a socket object
        Socket sock = new Socket(socketAddress, port);

        // Connect the socket to the server
        OutputStream out;
        try (out =sock.getOutputStream()){
            out.write(publicMethod().getBytes());
            out.close();
        }

        // Close the socket
        sock.close();
    }

}