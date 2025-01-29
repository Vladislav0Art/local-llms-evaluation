package org.traccar.protocol;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetId {

    @Test
    public void testGetId() {
        CellTower cellTower = new CellTower(2, "Cell Tower 2", null);
        assertThat(cellTower.getId(), is(2));
    }

}