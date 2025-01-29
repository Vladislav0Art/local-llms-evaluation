package org.traccar.protocol;

public class GeneratedParseCellTower_ReturnsNullWhenEmpty {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parseCellTower_ReturnsNullWhenEmpty() {
        CellTower cellTower = new CellTower("");
        assertNull(this.parse(cellTower, null));
    }
}

}