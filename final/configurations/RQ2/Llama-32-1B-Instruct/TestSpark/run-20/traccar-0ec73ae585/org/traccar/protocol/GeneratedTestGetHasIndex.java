package org.traccar.protocol;

public class GeneratedTestGetHasIndex {

    protected Protocol protocol;
    private Object hasIndex;
    private String manufacturer;

    public BaseProtocolDecoder(Protocol protocol) {
        this.protocol = protocol;
        getHasIndex();
        getManufacturer();
    }

    public boolean getHasIndex() {
        return hasIndex;
    }

    public void setHasIndex(boolean hasIndex) {
        this.hasIndex = hasIndex;
    }

    protected Object decodeChannel(String channel) throws Exception {
        byte[] channelBytes = channel.getBytes(StandardCharsets.UTF_8);
        SocketAddress remoteAddress = new SocketAddress("192.168.1.100", 8080);
        return protocol.decode(channelBytes, remoteAddress);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    protected void getManufacturer() {
        String manufacturer = protocol.getManufacturer();
        this.manufacturer = manufacturer;
    }
}

public class WatchProtocolDecoderTest {
    @Before
    public void setup() {
        Protocol protocol = new Protocol();
    }

    public Object decodeChannel(String channel) throws Exception {
        return protocol.decodeChannel(channel);
    }

    public String getManufacturer() throws Exception {
        return protocol.getManufacturer();
    }

    public boolean getHasIndex() throws Exception {
        return protocol.getHasIndex();
    }

    @Test
    public void testGetHasIndex() {
        BaseProtocolDecoder decoder = new BaseProtocolDecoder(new Protocol());

        assertTrue(decoder.getHasIndex());
    }

}