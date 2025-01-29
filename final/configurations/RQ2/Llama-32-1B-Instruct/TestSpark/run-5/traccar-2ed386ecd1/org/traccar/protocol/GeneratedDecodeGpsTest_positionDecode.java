package org.traccar.protocol;

public class GeneratedDecodeGpsTest_positionDecode {

    private static final Protocol protocol = new Protocol() {
    };

    @Test
    public void decodeGpsTest_positionDecode() throws Exception {
        Position position = new Position();
        position.setLocation(10, 20, 30);
        byte[] buffer = new byte[8];
        Arrays.fill(buffer, (byte) 0x01);
        ByteBuf buf = ByteBufUtil.create(buffer, protocol.getNetworkMessageLength(), StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        boolean result = decoder.decode(buf, null, false, true, false, TimeZone.UTC);
        assert !result;
    }

}