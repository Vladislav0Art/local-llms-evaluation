package org.traccar.protocol;

public class GeneratedTestGetProtocolData {

    private final int protocolId;
    private final byte[] protocolData;

    public WatchProtocolDecoder(int protocolId, byte[] protocolData) {
        this.protocolId = protocolId;
        this.protocolData = protocolData;
    }

    public int getProtocolId() {
        return protocolId;
    }

    public byte[] getProtocolData() {
        return protocolData;
    }
}

public class WatchProtocolDecoderTest {

    @Test
    public void testGetProtocolData() {
        byte[] protocolData = new byte[]{1, 2, 3};
        byte[] result = getProtocolData(protocolData);
        assert Arrays.equals(result, new byte[]{1, 2, 3});
    }

    private byte[] getProtocolData(byte[] protocolData) {
        return protocolData;
    }

}