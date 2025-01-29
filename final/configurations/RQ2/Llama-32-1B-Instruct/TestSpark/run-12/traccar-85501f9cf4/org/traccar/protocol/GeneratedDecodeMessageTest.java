package org.traccar.protocol;

public class GeneratedDecodeMessageTest {

    @Test
    public void decodeMessageTest() {
        Network network = new Network();
        CellTower cellTower = new CellTower();
        cellTower.setCellId("1234567890");
        cellTower.setLongitude(-122.4194);
        assertTrue(Gt06ProtocolDecoder.decodeGt06(network, cellTower, true, null) == true);

        assertFalse(Gt06ProtocolDecoder.decodeGt06(new Network(), cellTower, true, null));
    }

}