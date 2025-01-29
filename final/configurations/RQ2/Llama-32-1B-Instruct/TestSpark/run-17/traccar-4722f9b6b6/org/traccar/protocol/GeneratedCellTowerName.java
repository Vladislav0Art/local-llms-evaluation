package org.traccar.protocol;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedCellTowerName {

    public static CellTower createCellTower(int id, String name) {
        return new CellTower(id, name);
    }

    @Test
    public void cellTowerName() {
        CellTower cellTower = createCellTower(2, "Cell Tower 2");
        MatcherAssert.assertThat(cellTower.getName(), is("Cell Tower 2"));
    }

}