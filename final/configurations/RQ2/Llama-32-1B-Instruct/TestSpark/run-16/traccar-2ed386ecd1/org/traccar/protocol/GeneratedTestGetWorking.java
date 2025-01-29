package org.traccar.protocol;

public class GeneratedTestGetWorking {

    public static byte[] CENTRAL_EAST = new byte[]{0x01, 0x02};

    @Test
    public void testGetWorking() {
        CellTower cellTower = new CellTower(working);
        assertEquals(CellTower.WORKING, (byte[]) cellTower.getValue());
    }

}