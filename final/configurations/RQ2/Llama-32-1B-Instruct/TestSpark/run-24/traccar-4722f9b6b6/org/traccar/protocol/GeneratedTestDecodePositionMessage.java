package org.traccar.protocol;

public class GeneratedTestDecodePositionMessage {

    @Test
    public void testDecodePositionMessage() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position position = decoder.decode(Position.class, SocketAddress.inbound(0x20001));
        Assert.assertNotNull(position);
    }
}

class BaseProtocolDecoder {
}

interface DeviceSession {
}

public class Protocol {

    public Protocol() {
    }

    public boolean getHasIndex() {
        return false;
    }

    public String getManufacturer() {
        return "Unknown";
    }

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        return null;
    }
}

class CellTower extends BaseProtocolDecoder implements DeviceSession {
}

class Network {

    public Network() {
    }

    public Network() {
        super();
    }

    public static class Response {

        public Response(String... messages) {
            super(messages);
        }
    }

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        return new Response("Response 1", "Response 2");
    }
}

class Position extends BaseProtocolDecoder implements DeviceSession {
}

class WifiAccessPoint extends BaseProtocolDecoder {

    public static class Response {

        public Response(String... messages) {
            super(messages);
        }

        @Override
        public Object decode(
                Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
            return "Response 3";
        }
    }

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        return new Response("Response 4");
    }

}