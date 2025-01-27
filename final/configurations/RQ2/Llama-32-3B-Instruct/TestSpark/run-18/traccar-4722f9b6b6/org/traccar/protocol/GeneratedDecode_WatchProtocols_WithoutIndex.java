package org.traccar.protocol;

public class GeneratedDecode_WatchProtocols_WithoutIndex {

    @Test
    public void decode_WatchProtocols_WithoutIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        buf.writeByte(0x00);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WatchProtocols);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(WatchProtocol.class, result.getClass());
    }

}