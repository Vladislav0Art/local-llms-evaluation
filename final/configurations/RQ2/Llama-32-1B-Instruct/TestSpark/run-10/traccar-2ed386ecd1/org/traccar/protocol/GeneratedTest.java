package org.traccar.protocol;

public class GeneratedTest {

    private static final String GT06_PROTOCOL = "1A 00 00 00 00";
    private static final ByteBuf GROUND_TIME = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
    private static final NetworkNetworkMessage networkMessage = new NetworkNetworkMessage();

    @Test
    public void testDecodeGt06Protocol() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        ByteBuf buf = GROUND_TIME;
        return decoder.decode(buf, null, false, false, false, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeGroundTime() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        byte[] groundTimeBytes = GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8);
        decoder.decode(GroundTime.buffer(groundTimeBytes), null, false, false, false, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeNetworkMessage() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        networkMessage = new NetworkNetworkMessage();
        decoder.decode(networkMessage.getBuffer(), null, true, false, false, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeNoGroundTime() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        ByteBuf buf = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
        return decoder.decode(buf, null, false, false, false, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeNoNetworkMessage() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        ByteBuf buf = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
        return decoder.decode(buf, null, false, false, false, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeNoNetworkMessageOrGroundTime() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        ByteBuf buf = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
        return decoder.decode(buf, null, false, false, true, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeNetworkMessageOrGroundTime() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        networkMessage = new NetworkNetworkMessage();
        ByteBuf buf = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
        return decoder.decode(buf, null, true, false, false, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeNoGroundTimeOrNetworkMessage() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        ByteBuf buf = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
        return decoder.decode(buf, null, false, true, false, TimeZone.getTimeZone("UTC"));
    }

    @Test
    public void testDecodeNoNetworkMessageOrGroundTimeOrNetworkMessage() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        ByteBuf buf = Unpooled.buffer(GT06_PROTOCOL.getBytes(StandardCharsets.UTF_8));
        return decoder.decode(buf, null, false, true, true, TimeZone.getTimeZone("UTC"));
    }

}