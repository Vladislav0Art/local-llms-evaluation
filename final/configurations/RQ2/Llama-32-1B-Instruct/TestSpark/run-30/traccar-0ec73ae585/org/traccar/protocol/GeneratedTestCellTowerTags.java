package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCellTowerTags {

    @Test
    public void testCellTowerTags() {
        public class CellTower extends WifiAccessPoint {
            private String mac;

            public CellTower(String name, String description, String mac) {
                super(name, description);
                this.mac = mac;
            }

            @Override
            protected List<String> getTags() {
                return new ArrayList<>();
            }
        }

        CellTower cellTower = new CellTower("test", "test2", "00:11:22:33:44:55");
        assertEquals(1, cellTower.tags.size());
        assertEquals("tag0", cellTower.tags.get(0));
    }

}