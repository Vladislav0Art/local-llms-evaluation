package org.traccar.protocol;

public class GeneratedTestGetCentralEast {

    public static byte[] CENTRAL_EAST = new byte[]{0x01, 0x02};

    @Test
    public void testGetCentralEast() {
        Network network = new Network(centralEast);
        assertEquals(Network.CENTRAL_EAST, (byte[]) network.getValue());
    }
}

public class TestCellTower2Implementation extends AbstractCellTowerImplementation {

    private byte[] working;

    @Before
    public void setUp() {
        working = WORKING;
    }

}