package org.traccar.protocol;

public class GeneratedTestGt06ProtocolDecoder {

    private String address;
    private int port;

    public SocketAddress(String address, int port) {
        this.address = address;
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }
}

public interface Protocol {
    enum GT06 {
        GT06
    }

    interface Gt06ProtocolDecoder {
        Object decode(Channel channel, SocketAddress remoteAddress, Object msg);

        Gt06 getProtocolType();
    }

    class Position {
        private String type;
        private float lat;
        private float lon;

        public Position(String type, String latStr, String lonStr) {
            this.type = type;
            this.lat = Float.parseFloat(latStr);
            this.lon = Float.parseFloat(lonStr);
        }

        public Position(float lat, float lon) {
            this(-1, -1, lat, lon);
        }

        public String getType() {
            return type;
        }

        public float getLat() {
            return lat;
        }

        public float getLon() {
            return lon;
        }
    }
}

public class Channel {
    private Object message;

    public Channel(Object message) {
        this.message = message;
    }

    public Object getMessage() {
        return message;
    }
}

public class TraccarMessageDecoder {
    public Object decode(Channel channel, SocketAddress remoteAddress, Object msg) {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        return decoder.decode(channel, remoteAddress, msg);
    }

    public Gt06 getProtocolType(Channel channel, SocketAddress remoteAddress) {
        return Protocol.GT06;
    }
}

public class GeneratedTest {

    @Test
    public void testGt06ProtocolDecoder() throws Exception {
        Channel channel = new Channel(null);
        SocketAddress remoteAddress = new SocketAddress("localhost", 8080);
        Object msg = null;

        TraccarMessageDecoder decoder = new TraccarMessageDecoder();
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(result);
    }

}