package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodeCellTower() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        CellTower cellTower = decoder.decode(CellTower.class, SocketAddress.inbound(0x0001));
        Assert.assertNotNull(cellTower);
    }

    @Test
    public void testDecodeNetwork() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Network network = decoder.decode(Network.class, SocketAddress.inbound(0x0002));
        Assert.assertNotNull(network);
    }

    @Test
    public void testDecodePosition() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Position position = decoder.decode(Position.class, SocketAddress.inbound(0x0003));
        Assert.assertNotNull(position);
    }

    @Test
    public void testDecodeWifiAccessPoint() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        WifiAccessPoint wifiAccessPoint = decoder.decode(WifiAccessPoint.class, SocketAddress.inbound(0x0004));
        Assert.assertNotNull(wifiAccessPoint);
    }

    @Test
    public void testDecodeWatchProtocolMessage() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Network network = decoder.decode(Network.class, SocketAddress.inbound(0x8001));
        CellTower cellTower = decoder.decode(CellTower.class, SocketAddress.inbound(0x8002));
        WifiAccessPoint wifiAccessPoint = decoder.decode(WifiAccessPoint.class, SocketAddress.inbound(0x8003));
    }

    @Test
    public void testDecodeNetworkMessage() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Network network = decoder.decode(Network.class, SocketAddress.inbound(0x10001));
        CellTower cellTower = decoder.decode(CellTower.class, SocketAddress.inbound(0x10002));
    }

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