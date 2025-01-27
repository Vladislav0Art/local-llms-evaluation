package org.traccar.protocol;

public class GeneratedTestCellCreationAndAssociationWithCellTower {

    private int cellTowerId;
    private String location;

    public CellTower(int cellTowerId, String location) {
        this.cellTowerId = cellTowerId;
        this.location = location;
    }

    public int getCellTowerId() {
        return cellTowerId;
    }

    public void setCellTowerId(int cellTowerId) {
        this.cellTowerId = cellTowerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

public class Cell {
    private int id;
    private int signalStrength;
    private CellTower cellTower;

    public Cell(int id, int signalStrength, CellTower cellTower) {
        this.id = id;
        this.signalStrength = signalStrength;
        this.cellTower = cellTower;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSignalStrength() {
        return signalStrength;
    }

    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
    }

    public CellTower.getCellTower()

    {
        return cellTower;
    }

    public void setCellTower(CellTower cellTower) {
        this.cellTower = cellTower;
    }
}

public class TestCases {

    @Test
    public void testCellCreationAndAssociationWithCellTower() {
        CellTower cellTower = new CellTower(1, "New York");
        int id = 2;
        int signalStrength = 50;
        Cell cell = new Cell(id, signalStrength, cellTower);
        assert (cell.getCellTower().equals(cellTower));
    }

}