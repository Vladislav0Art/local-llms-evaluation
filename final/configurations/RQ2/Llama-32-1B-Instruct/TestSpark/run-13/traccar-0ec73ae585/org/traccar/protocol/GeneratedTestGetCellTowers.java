package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetCellTowers {

    public CellTower createCellTower(String name, int id) {
        return new CellTower(name, id);
    }

    @Test
    public void testGetCellTowers() {
        CellTower cellTower1 = createCellTower("tower1", 2);
        CellTower cellTower2 = createCellTower("tower2", 3);
        assertEquals(3, cellTower2.getId());

        Position position1 = new Position(5, 6);
        CellTower cellTower = createCellTower(position1.toString(), 4);
        assertEquals(4, cellTower.getId());
    }

}