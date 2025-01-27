package org.traccar.protocol;

public class GeneratedDecode_Position_WithIndex {

    @Test
    public void decode_Position_WithIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        buf.writeByte(0x04);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Positions);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(Position.class, result.getClass());
    }

}