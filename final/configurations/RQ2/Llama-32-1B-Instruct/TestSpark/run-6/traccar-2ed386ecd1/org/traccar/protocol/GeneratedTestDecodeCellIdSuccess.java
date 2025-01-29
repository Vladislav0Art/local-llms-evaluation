package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.fail;

public class GeneratedTestDecodeCellIdSuccess {

    public int getCellId() {
        return 1;
    }

    public String getLatitude() {
        return "45";
    }

    public String getLongitude() {
        return "75";
    }
}

public class CellTowerGenerator {
    public CellTower generateCellTower() {
        return new CellTower();
    }

    public String generateLatitude() {
        return "45";
    }

    public String generateLongitude() {
        return "75";
    }
}

public class CellTowerDecoder {
    public int decodeCellId(CellTower cellTower) {
        if (cellTower.getCellId() != 1) {
            throw new IllegalArgumentException("Invalid cell id");
        } else {
            return cellTower.getLatitude();
        }
    }

    public String decodeLatitude(CellTower cellTower) {
        if (cellTower.getLatitude() != "45") {
            throw new IllegalArgumentException("Invalid latitude");
        } else {
            return cellTower.getLongitude();
        }
    }

    public String decodeLongitude(CellTower cellTower) {
        if (cellTower.getLongitude() != "75") {
            throw new IllegalArgumentException("Invalid longitude");
        } else {
            return null;
        }
    }
}

public class CellTowerTest {

    @Test
    public void testDecodeCellIdSuccess() throws Exception {
        CellTower cellTower = new CellTowerGenerator().generateCellTower();
        System.out.println(CellTowerDecoder.decodeCellId(cellTower)); // Output: 1

        try {
            CellTowerDecoder.decodeLatitude(cellTower); // No exception thrown, cell id is valid
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            CellTowerDecoder.decodeLongitude(cellTower); // throws an exception because of non-numeric value
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

}