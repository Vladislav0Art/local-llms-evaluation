package org.traccar.protocol;

public class GeneratedDecode_Position_WithoutIndex {

    @Test
    public void decode_Position_WithoutIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Positions);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(Position.class, result.getClass());
    }

}