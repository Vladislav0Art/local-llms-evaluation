package org.traccar.protocol;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedCellTowersSize {

    public static CellTower createCellTower(int id, String name) {
        return new CellTower(id, name);
    }

    @Test
    public void cellTowersSize() {
        CellTower cellTower = createCellTower(1, "Cell Tower 1");
        assertThat(cellTower.getCellTowers().size(), is(1));
    }

}