package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPositionsByName {

    public CellTower createCellTower(String name, int id) {
        return new CellTower(name, id);
    }

    @Test
    public void testGetPositionsByName() {
        Position position1 = new Position(11, 12);
        CellTower cellTower1 = createCellTower("tower1", 5);
        CellTower cellTower2 = createCellTower(position1.toString(), 6);

        assertEquals(cellTower1.getPosition(), cellTower2.getPosition());
    }

}