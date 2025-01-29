package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    private static final String GT06_PROTOCOL = "1A 00 00 00 00";
    private static final ByteBuf GROUND_TIME = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
    private static final NetworkNetworkMessage networkMessage = new NetworkNetworkMessage();

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        networkMessage = new NetworkNetworkMessage();
        decoder.decode(networkMessage.getBuffer(), null, true, false, false, TimeZone.getTimeZone("UTC"));
    }

}