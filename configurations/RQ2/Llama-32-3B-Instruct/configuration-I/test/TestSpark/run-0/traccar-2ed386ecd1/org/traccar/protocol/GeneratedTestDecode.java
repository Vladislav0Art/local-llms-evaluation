package org.traccar.protocol;

public class GeneratedTestDecode {

    @Rule
    public TestRule rule = new TestRules();

    private static final Channel channel = MockChannel - channel();
    private static final Object remoteAddress = mock(SocketAddress.class);
    private static final Object msg = new Position(0x12, 0x34);

    @Test
    public void testDecode() {
        assertTrue(Gt06ProtocolDecoder.decode(channel, remoteAddress, msg));
    }
}

public class MockChannel extends Channel {
    private Object remoteAddress;
    private Object msg;

    @Override
    public SocketAddress remoteAddress() {
        return (SocketAddress) getRemoteAddress();
    }

    @Override
    public void setRemoteAddress(SocketAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }

    @Override
    public Object getMsg() {
        return msg;
    }

    @Override
    public void setMsg(Object msg) {
        this.msg = msg;
    }
}

public class Position {

    private int lat;
    private int lon;

    public Position(int lat, int lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Position))
            return false;
        Position other = (Position) obj;
        return (lat == other.lat) && (lon == other.lon);
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }
}

public class SocketAddress {

    private String host;
    private int port;

    public SocketAddress(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SocketAddress))
            return false;
        SocketAddress other = (SocketAddress) obj;
        return (host.equals(other.host)) && (port == other.port);
    }
}

public class Gt06ProtocolDecoder {

    public static boolean decode(Channel channel, SocketAddress remoteAddress, Object msg) {
        // implementation
    }

}