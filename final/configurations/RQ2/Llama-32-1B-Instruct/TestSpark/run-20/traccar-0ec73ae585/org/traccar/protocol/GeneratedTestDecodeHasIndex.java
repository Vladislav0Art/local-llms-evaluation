package org.traccar.protocol;

public class GeneratedTestDecodeHasIndex {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    public byte[] decodeChannel(String channel) throws Exception {
        return (byte[]) protocol.decode(channel, null);
    }

    public String decodeManufacturer(String manufacturer) throws Exception {
        return protocol.getManufacturer();
    }

    public Object decodeHasIndex(boolean hasIndex) throws Exception {
        return protocol.getHasIndex();
    }

    @Test
    public void testDecodeHasIndex() {
        boolean hasIndex = true;
        Object hasIndexObj = decodeHasIndex(hasIndex);
        assert hasIndexObj == hasIndex;
    }

}