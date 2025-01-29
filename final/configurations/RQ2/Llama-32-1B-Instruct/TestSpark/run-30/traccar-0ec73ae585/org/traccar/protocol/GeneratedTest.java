package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testWifiAccessPoint() {
        // Arrange
        public class WifiAccessPoint {
            public int id = 1;
            public String name = "test";
            public String description = "";
            public List<String> tags = new ArrayList<>();

            public WifiAccessPoint(String name, String description) {
                this.name = name;
                this.description = description;
                for (int i = 0; i < 10; i++) {
                    tags.add("tag" + i);
                }
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, id);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                WifiAccessPoint that = (WifiAccessPoint) o;
                return id == that.id && Objects.equals(name, that.name);
            }
        }

        public class CellTower extends WifiAccessPoint {
            @Override
            protected List<String> getTags() {
                // implementation
                return new ArrayList<>();
            }
        }

        public class MobileDevice extends WifiAccessPoint {
            private String mac;

            public MobileDevice(String name, String description) {
                super(name, description);
                this.mac = "00:11:22:33:44:55";
            }
        }

        public class Network extends WifiAccessPoint {
            public Network(String name, String description) {
                super(name, description);
            }
        }

        public static void main (String[]args){
            System.out.println(WifiAccessPoint.id);
            assertEquals(1, new WifiAccessPoint("test").hashCode());
            assertTrue(new WifiAccessPoint("test", "test2").equals(new WifiAccessPoint("test", "test2")));
            List<String> tags = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                tags.add("tag" + i);
            }
            assertEquals(1, new WifiAccessPoint("test", "test3").hashCode());
            assertTrue(new WifiAccessPoint("test", "test4").equals(new WifiAccessPoint("test", "test5")));
        }

        @Test
        public void testWifiAccessPointTags () {
            public class Network extends WifiAccessPoint {
                @Override
                protected List<String> getTags() {
                    return new ArrayList<>();
                }
            }

            Network network = new Network("test", "test2");
            assertEquals(0, network.tags.size());
            for (String tag : network.tags) {
                assertEquals("tag0", tag);
            }
        }

        @Test
        public void testCellTowerTags () {
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

        @Test
        public void testMobileDeviceTags () {
            public class MobileDevice extends WifiAccessPoint {
                private String mac;

                public MobileDevice(String name, String description, String mac) {
                    super(name, description);
                    this.mac = mac;
                }
            }

            MobileDevice mobileDevice = new MobileDevice("test", "test2", "00:11:22:33:44:55");
            assertEquals(1, mobileDevice.tags.size());
            assertEquals("tag0", mobileDevice.tags.get(0));
        }
    }

}