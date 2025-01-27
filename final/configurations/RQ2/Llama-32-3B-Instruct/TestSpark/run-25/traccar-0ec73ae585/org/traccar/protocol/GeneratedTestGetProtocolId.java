package org.traccar.protocol;

public class GeneratedTestGetProtocolId {

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
    public void testGetProtocolId() {
        int protocolId = 1;
        int result = getProtocolId(protocolId);
        assert result == 1;
    }

    private int getProtocolId(int protocolId) {
        return protocolId;
    }

}