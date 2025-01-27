package org.traccar.protocol;

public class GeneratedTest {

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

    class Position {
        private String type;
        private float lat;
        private float lon;

        public Position(String type, float lat, float lon) {
            this.type = type;
            this.lat = lat;
            this.lon = lon;
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

    interface Gt06ProtocolDecoder {
        Object decode(Channel channel, SocketAddress remoteAddress, Object msg);

        Gt06 getProtocolType();
    }

    class Channel {
        private Object message;

        public Channel(Object message) {
            this.message = message;
        }

        public Object getMessage() {
            return message;
        }
    }
}

public class TraccarMessageDecoder {
    public Object decode(Channel channel, SocketAddress remoteAddress, Object msg) {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        return decoder.decode(channel, remoteAddress, msg);
    }

    public Gt06 getProtocolType() {
        return Protocol.GT06;
    }
}

public class GeneratedTest {

}