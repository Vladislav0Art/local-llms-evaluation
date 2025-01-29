package org.traccar.protocol;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestCellTower {

    @Test
    public void testCellTower() {
        CellTower cellTower = new CellTower(1, "Cell Tower 1", null);
        assertThat(cellTower.getId(), is(1));
        assertThat(cellTower.getName(), is("Cell Tower 1"));
        assertThat(cellTower.getCellTowers().size(), is(0));
    }

}