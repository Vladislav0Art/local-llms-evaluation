package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAddRemoveCellTowers {

    public void testCellularNetwork() {
        // Test 1: Get cell tower information
        CellularNetwork cellularNetwork = new CellularNetwork();
        String cellTowerInfo = cellularNetwork.getCellTowerInfo();
        assertEquals("AT&T Cell Tower", cellTowerInfo);

        // Test 2: Add a cell tower
        String cellTower = "AT&T Cell Tower";
        cellularNetwork.addCellTower(cellTower);
        String updatedCellTowerInfo = cellularNetwork.getCellTowerInfo();
        assertEquals(cellTower, updatedCellTowerInfo);

        // Test 3: Get the number of cell towers
        int numCellTowers = cellularNetwork.getNumCellTowers();
        assertEquals(1, numCellTowers);

        // Test 4: Update a cell tower name
        String updatedCellTowerName = "Verizon Cell Tower";
        cellularNetwork.updateCellTower(cellTower, updatedCellTowerName);
        String updatedUpdatedCellTowerInfo = cellularNetwork.getCellTowerInfo();
        assertEquals(updatedCellTowerName, updatedUpdatedCellTowerInfo);

        // Test 5: Remove a cell tower
        String removedCellTower = "AT&T Cell Tower";
        cellularNetwork.removeCellTower(removedCellTower);
        String updatedRemovedCellTowerInfo = cellularNetwork.getCellTowerInfo();
        assertEquals("", updatedRemovedCellTowerInfo);
    }

    @Test
    public void testAddRemoveCellTowers() {
        CellularNetwork cellularNetwork = new CellularNetwork();

        // Test 1: Add and remove two cell towers
        String cellTower1 = "AT&T Cell Tower";
        String cellTower2 = "Verizon Cell Tower";

        cellularNetwork.addCellTower(cellTower1);
        cellularNetwork.addCellTower(cellTower2);

        String updatedRemovedCellTowerInfo = cellularNetwork.getCellTowerInfo();
        assertEquals("AT&T Cell Tower", updatedRemovedCellTowerInfo);
    }

}