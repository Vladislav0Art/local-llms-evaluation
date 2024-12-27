package org.traccar.protocol;

public class GeneratedTest {

    private Object remoteAddress;

    public static void channel() {
        // implementation
    }

    @Override
    public SocketAddress getRemoteAddress() {
        return (SocketAddress) remoteAddress;
    }
}

class Position {
    public int lat;
    public int lon;

    public Position(int lat, int lon) {
        this.lat = lat;
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Position{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}

class SocketAddress {
    private String address;

    public SocketAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }
}

public class Gt06ProtocolDecoder {

    public static boolean decode(Channel channel, SocketAddress remoteAddress, Object msg) {
        // implementation
        return false;
    }

    @Override
    public void setRemoteAddress(SocketAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}

class TestRule {
    private MockChannel channel;

    public TestRule(MockChannel channel) {
        this.channel = channel;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

public class GeneratedTest {

    private static final TestRule rule = new TestRules();

    @Rule
    public void myRule() {
    }

    @Test
    public void testMethod() {
        // implementation
    }

}