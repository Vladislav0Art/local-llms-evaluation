package org.traccar.protocol;

public class GeneratedDecodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneAndDateDecode {

    private static final Protocol protocol = new Protocol() {
    };

    @Test
    public void decodeGpsTest_positionNoHasChecksumAndSpeedDecodeAndDateDecodeAndTimezoneAndDateDecode() throws Exception {
        Position position = new Position();
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, true, false, false, TimeZone.UTC);
        assert !result;
    }

}