package org.traccar.protocol;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetCellTowers {

    @Test
    public void testGetCellTowers() {
        CellTower cellTower = new CellTower(2, "Cell Tower 2", null);
        CellTower otherCellTower = new CellTower(3, "Cell Tower 3", null);
        assertThat(cellTower.getCellTowers().size(), is(1));
        assertThat(otherCellTower.getId(), is(0));
    }

}