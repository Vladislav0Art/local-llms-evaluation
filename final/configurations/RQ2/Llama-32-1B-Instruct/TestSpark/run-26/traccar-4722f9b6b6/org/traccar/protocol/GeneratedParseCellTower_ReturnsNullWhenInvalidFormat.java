package org.traccar.protocol;

public class GeneratedParseCellTower_ReturnsNullWhenInvalidFormat {

    public MockBaseProtocolDecoderTest() {
    }

    @Test
    public void parseCellTower_ReturnsNullWhenInvalidFormat() {
        CellTower cellTower = new CellTower();
        assertNull(this.parse(cellTower, null));
    }

}