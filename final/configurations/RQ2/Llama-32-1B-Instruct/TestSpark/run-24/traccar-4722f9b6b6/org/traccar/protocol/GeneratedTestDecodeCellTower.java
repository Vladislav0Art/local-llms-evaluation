package org.traccar.protocol;

public class GeneratedTestDecodeCellTower {

    @Test
    public void testDecodeCellTower() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        CellTower cellTower = decoder.decode(CellTower.class, SocketAddress.inbound(0x0001));
        Assert.assertNotNull(cellTower);
    }

}