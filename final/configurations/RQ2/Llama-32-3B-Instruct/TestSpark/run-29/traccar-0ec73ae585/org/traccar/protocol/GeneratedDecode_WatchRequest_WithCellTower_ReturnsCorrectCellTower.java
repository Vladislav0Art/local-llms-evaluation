package org.traccar.protocol;

public class GeneratedDecode_WatchRequest_WithCellTower_ReturnsCorrectCellTower {

    @Test
    public void decode_WatchRequest_WithCellTower_ReturnsCorrectCellTower() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        CellTower cellTower = CellTower.builder()
                .cellId("123")
                .networkId("456")
                .mcc("777")
                .mnc("888")
                .lac("999")
                .cio("000")
                .timestamp(new Date())
                .build();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = decoder.decode(channel, remoteAddress, cellTower);
        assertNotNull(msg);
        assertTrue(BufferUtil.containsBytes((ByteBuf) msg, BufferUtil.encodeCellTower("123", "456")));
    }

}