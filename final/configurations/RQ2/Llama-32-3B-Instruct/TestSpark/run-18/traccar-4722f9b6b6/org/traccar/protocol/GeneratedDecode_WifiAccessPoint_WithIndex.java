package org.traccar.protocol;

public class GeneratedDecode_WifiAccessPoint_WithIndex {

    @Test
    public void decode_WifiAccessPoint_WithIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        buf.writeByte(0x02);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WifiAccessPoints);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(WifiAccessPoint.class, result.getClass());
    }

}