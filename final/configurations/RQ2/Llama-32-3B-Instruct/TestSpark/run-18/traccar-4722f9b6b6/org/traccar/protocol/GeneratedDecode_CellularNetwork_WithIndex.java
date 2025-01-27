package org.traccar.protocol;

public class GeneratedDecode_CellularNetwork_WithIndex {

    @Test
    public void decode_CellularNetwork_WithIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        buf.writeByte(0x03);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.CellularNetworks);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(CellularNetwork.class, result.getClass());
    }

}