package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public CellTower createCellTower(String name, int id) {
        return new CellTower(name, id);
    }

    @Test
    public void testCreateCellTower() {
        CellTower cellTower = createCellTower("tower1", 1);
        assertEquals("tower1", cellTower.getName());
        assertEquals(1, cellTower.getId());
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

    @Test
    public void testGetPositions() {
        Position position1 = new Position(7, 8);
        Position position2 = new Position(9, 10);

        CellTower cellTower1 = createCellTower(position1.toString(), 5);
        CellTower cellTower2 = createCellTower(position2.toString(), 6);

        assertEquals(position2, cellTower1.getPosition());
    }

    @Test
    public void testGetPositionsByName() {
        Position position1 = new Position(11, 12);
        CellTower cellTower1 = createCellTower("tower1", 5);
        CellTower cellTower2 = createCellTower(position1.toString(), 6);

        assertEquals(cellTower1.getPosition(), cellTower2.getPosition());
    }

    @Test
    public void testGetPositionsById() {
        Position position1 = new Position(13, 14);
        CellTower cellTower1 = createCellTower("tower1", 5);
        CellTower cellTower2 = createCellTower(position1.toString(), 6);

        assertEquals(cellTower1.getPosition(), cellTower2.getPosition());
    }

    @Test
    public void testGetPositionsByPosition() {
        Position position1 = new Position(15, 16);
        CellTower cellTower1 = createCellTower("tower1", 5);
        CellTower cellTower2 = createCellTower(position1.toString(), 6);

        assertEquals(cellTower1.getPosition(), cellTower2.getPosition());
    }

}