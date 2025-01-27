package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void decode_WatchProtocols_WithIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        buf.writeByte(0x00);
        buf.writeByte(0x10);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WatchProtocols);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(WatchProtocol.class, result.getClass());
    }

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

    @Test
    public void decode_WifiAccessPoint_WithoutIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WifiAccessPoints);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(WifiAccessPoint.class, result.getClass());
    }

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

    @Test
    public void decode_CellularNetwork_WithoutIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.CellularNetworks);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(CellularNetwork.class, result.getClass());
    }

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

    @Test
    public void decode_Position_WithoutIndex() {
        ByteBuf buf = Unpooled.buffer(5);
        buf.writeByte(0x01);
        buf.writeByte(0x00);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Positions);
        Object result = decoder.decode(null, null, buf);
        Assert.assertEquals(Position.class, result.getClass());
    }

    @Test
    public void getHasIndex_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WatchProtocols);
        boolean result = decoder.getHasIndex();
        Assert.assertFalse(result);
    }

    @Test
    public void getManufacturer_ReturnsString() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WatchProtocols);
        String result = decoder.getManufacturer();
        Assert.isNotEmpty(result);
    }

}