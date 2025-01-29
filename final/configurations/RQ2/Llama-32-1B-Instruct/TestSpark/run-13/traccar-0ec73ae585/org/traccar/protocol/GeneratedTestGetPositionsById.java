package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPositionsById {

    public CellTower createCellTower(String name, int id) {
        return new CellTower(name, id);
    }

    @Test
    public void testGetPositionsById() {
        Position position1 = new Position(13, 14);
        CellTower cellTower1 = createCellTower("tower1", 5);
        CellTower cellTower2 = createCellTower(position1.toString(), 6);

        assertEquals(cellTower1.getPosition(), cellTower2.getPosition());
    }

}