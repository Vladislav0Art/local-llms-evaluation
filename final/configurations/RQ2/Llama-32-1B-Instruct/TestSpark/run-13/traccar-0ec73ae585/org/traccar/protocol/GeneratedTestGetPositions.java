package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPositions {

    public CellTower createCellTower(String name, int id) {
        return new CellTower(name, id);
    }

    @Test
    public void testGetPositions() {
        Position position1 = new Position(7, 8);
        Position position2 = new Position(9, 10);

        CellTower cellTower1 = createCellTower(position1.toString(), 5);
        CellTower cellTower2 = createCellTower(position2.toString(), 6);

        assertEquals(position2, cellTower1.getPosition());
    }

}