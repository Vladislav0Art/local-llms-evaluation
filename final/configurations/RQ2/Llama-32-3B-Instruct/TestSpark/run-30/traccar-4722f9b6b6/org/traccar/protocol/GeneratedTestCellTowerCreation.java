package org.traccar.protocol;

public class GeneratedTestCellTowerCreation {

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
    public void testCellTowerCreation() {
        CellTower cellTower = new CellTower(1, "New York");
        assert (cellTower.getCellTowerId() == 1);
        assert (cellTower.getLocation().equals("New York"));
    }

}