package org.traccar.protocol;

public class GeneratedTestGetPort {

    @Test
    public void testGetPort() {
        SocketAddress socketAddress = new SocketAddress("localhost", 8080);
        assertEquals(8080, socketAddress.getPort());
    }
}

public class GalileoProtocolDecoder {

    public enum Protocol {GALILEO}

    private final Protocol protocol;

    public GalileoProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
    }

    public byte[] decode(byte[] data) {
        // decoding logic goes here
        return null; // replace with actual decoding logic
    }
}

public class Channel {

    private final SocketAddress remoteAddress;

    public Channel(SocketAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    public String getRemoteAddress() {
        return remoteAddress.toString();
    }
}

public class SocketAddress {

    private final String host;
    private final int port;

    public SocketAddress(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

}