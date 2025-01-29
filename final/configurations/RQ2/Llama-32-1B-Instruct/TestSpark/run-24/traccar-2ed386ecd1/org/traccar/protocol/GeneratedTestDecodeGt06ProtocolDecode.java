package org.traccar.protocol;

public class GeneratedTestDecodeGt06ProtocolDecode {

    private Protocol protocol;

    @Test
    public void testDecodeGt06ProtocolDecode() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        String message = "1234567890";
        byte[] bytes = HexUtils.hexStringToBytes(message);
        ByteBuf buf = Unpooled.buffer(bytes.length / 2, StandardCharsets.UTF_8);
        decoder.decode(buf, null, true, false, false, TimeZone.getDefault());
    }

}