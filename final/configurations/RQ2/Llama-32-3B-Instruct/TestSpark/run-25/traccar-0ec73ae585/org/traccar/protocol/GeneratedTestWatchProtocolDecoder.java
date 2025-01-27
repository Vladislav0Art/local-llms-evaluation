package org.traccar.protocol;

public class GeneratedTestWatchProtocolDecoder {

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
    public void testWatchProtocolDecoder() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(1, new byte[]{1, 2, 3});
        assert decoder.getProtocolId() == 1;
        assert Arrays.equals(decoder.getProtocolData(), new byte[]{1, 2, 3});
    }
}

}