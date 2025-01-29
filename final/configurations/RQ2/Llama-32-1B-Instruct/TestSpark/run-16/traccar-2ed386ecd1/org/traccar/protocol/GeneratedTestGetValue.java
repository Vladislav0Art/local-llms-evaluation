package org.traccar.protocol;

public class GeneratedTestGetValue {

    public static byte[] CENTRAL_EAST = new byte[]{0x01, 0x02};

    @Test
    public void testGetValue() {
        TestCellTowerImplementation testImplementation = new TestCellTowerImplementation();
        Network network = new Network(testImplementation.WORKING);
        assertEquals(CellTower.WORKING, (byte[]) network.getValue());
    }
}

public class TestNetworkImplementation {

    private byte[] centralEast;

    @Before
    public void setUp() {
        centralEast = CENTRAL_EAST;
    }

}