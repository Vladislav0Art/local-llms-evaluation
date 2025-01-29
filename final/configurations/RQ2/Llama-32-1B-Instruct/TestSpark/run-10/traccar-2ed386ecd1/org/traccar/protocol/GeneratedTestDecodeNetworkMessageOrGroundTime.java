package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessageOrGroundTime {

    private static final String GT06_PROTOCOL = "1A 00 00 00 00";
    private static final ByteBuf GROUND_TIME = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
    private static final NetworkNetworkMessage networkMessage = new NetworkNetworkMessage();

    @Test
    public void testDecodeNetworkMessageOrGroundTime() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        networkMessage = new NetworkNetworkMessage();
        ByteBuf buf = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
        return decoder.decode(buf, null, true, false, false, TimeZone.getTimeZone("UTC"));
    }

}