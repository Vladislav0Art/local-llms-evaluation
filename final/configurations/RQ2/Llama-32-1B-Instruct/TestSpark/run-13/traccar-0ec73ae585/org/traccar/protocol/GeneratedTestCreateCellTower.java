package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCreateCellTower {

    public CellTower createCellTower(String name, int id) {
        return new CellTower(name, id);
    }

    @Test
    public void testCreateCellTower() {
        CellTower cellTower = createCellTower("tower1", 1);
        assertEquals("tower1", cellTower.getName());
        assertEquals(1, cellTower.getId());
    }

}