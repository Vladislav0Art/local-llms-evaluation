package org.traccar.protocol;

public class GeneratedTestDecodeManufacturer {

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
    public void testDecodeManufacturer() {
        String manufacturer = "My Company";
        Object manufacturerObj = decodeManufacturer(manufacturer);
        assert manufacturerObj.equals("My Company");
    }

}