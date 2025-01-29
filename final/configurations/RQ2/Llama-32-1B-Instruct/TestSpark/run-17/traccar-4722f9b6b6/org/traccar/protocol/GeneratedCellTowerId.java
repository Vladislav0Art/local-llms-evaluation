package org.traccar.protocol;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GeneratedCellTowerId {

    public static CellTower createCellTower(int id, String name) {
        return new CellTower(id, name);
    }

    @Test
    public void cellTowerId() {
        CellTower cellTower = createCellTower(1, "Cell Tower 1");
        MatcherAssert.assertThat(cellTower.getId(), is(1));
    }

}