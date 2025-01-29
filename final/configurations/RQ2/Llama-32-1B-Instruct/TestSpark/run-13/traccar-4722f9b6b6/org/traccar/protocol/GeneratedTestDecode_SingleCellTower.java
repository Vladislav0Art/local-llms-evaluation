package org.traccar.protocol;

public class GeneratedTestDecode_SingleCellTower {

    @Test
    public void testDecode_SingleCellTower() throws Exception {
        Object msg = new CellTower();
        when(baseProtocolDecoder.decode(any(CHANNEL, any(SocketAddress), any(Object)))).thenReturn(msg);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        byte[] bytes = (byte[]) decoder.decode(null, null, "some message");

        assertEquals("some message", new String(bytes));
    }

}