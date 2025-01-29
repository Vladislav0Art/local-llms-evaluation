package org.traccar.protocol;

public class GeneratedTestDecodeGt06Protocol {

    private static final String GT06_PROTOCOL = "1A 00 00 00 00";
    private static final ByteBuf GROUND_TIME = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
    private static final NetworkNetworkMessage networkMessage = new NetworkNetworkMessage();

    @Test
    public void testDecodeGt06Protocol() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        ByteBuf buf = GROUND_TIME;
        return decoder.decode(buf, null, false, false, false, TimeZone.getTimeZone("UTC"));
    }

}