package org.traccar.protocol;

public class GeneratedDecode_CellularNetwork_WithoutIndex {

    @Test
    public void decode_CellularNetwork_WithoutIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.CellularNetworks);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(CellularNetwork.class, result.getClass());
    }

}