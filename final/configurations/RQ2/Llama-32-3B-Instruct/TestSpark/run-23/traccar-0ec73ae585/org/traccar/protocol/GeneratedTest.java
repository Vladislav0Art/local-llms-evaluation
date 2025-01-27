package org.traccar.protocol;

public class GeneratedTest {

}

public class Object {
}

public class Protocol {
    private boolean hasIndex;
    private String manufacturer;

    public void setHasIndex(boolean hasIndex) {
        this.hasIndex = hasIndex;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Object retainedData() {
        return new byte[0];
    }
}

public class NetworkMessage {
    private String data;

    public NetworkMessage() {
    }

    public void setData(String data) {
        this.data = data;
    }

    public static NetworkMessage create(String data) {
        return new NetworkMessage().setData(data);
    }
}

public class WatchProtocolDecoder {
    private Protocol protocol;

    public WatchProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
    }

    public Object decode(Channel channel, String remoteAddress, Object msg) {
        if (protocol.hasIndex()) {
            return new byte[]{1};
        } else if (protocol.getManufacturer().equals("test")) {
            return NetworkMessage.create(new byte[10]);
        }
        return null;
    }

    // Removed other methods
}

public class GeneratedTest {

    @Test
    public void testWatchProtocolDecoder() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.setHasIndex(true);
        decoder.setManufacturer("test");
        assertEquals(null, decoder.decode(new Channel(), "127.0.0.1:12345", decoder.retainedData()));
    }

    @Test
    public void testWatchProtocolDecoderNoIndex() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals(null, decoder.decode(new Channel(), "127.0.0.1:12345", decoder.retainedData()));
    }

    @Test
    public void testWatchProtocolDecoderManufacturer() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        decoder.setHasIndex(true);
        assertEquals(NetworkMessage.create(new byte[10]), decoder.decode(new Channel(), "127.0.0.1:12345", decoder.retainedData()));
    }

}