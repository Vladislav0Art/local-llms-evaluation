package org.traccar.protocol;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        CellTower cellTower = new CellTower(1, "Cell Tower 1", null);
        assertThat(cellTower.getName(), is("Cell Tower 1"));
    }

}