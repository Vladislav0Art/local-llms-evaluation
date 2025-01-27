package org.traccar.protocol;

public class GeneratedTestEnumEquals {

    @Test
    public void testEnumEquals() throws Exception {
        Protocol protocol1 = new Protocol().WATCH;
        Protocol protocol2 = new Protocol().WATCH;
        assertTrue(protocol1.equals(protocol2));
    }
}

public class SocketAddress {

    private InetSocketAddress address;

    public SocketAddress(InetSocketAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SocketAddress))
            return false;
        SocketAddress other = (SocketAddress) obj;
        return address.equals(other.address);
    }
}

public class InetSocketAddress {

    private int port;

    public InetSocketAddress(int port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof InetSocketAddress))
            return false;
        InetSocketAddress other = (InetSocketAddress) obj;
        return port == other.port;
    }
}

public class Protocol {

    private static final int WATCH_VALUE = 0;

    public static int WATCH = WATCH_VALUE;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Protocol))
            return false;
        return true;
    }

}