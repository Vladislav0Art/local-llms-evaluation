package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestMobileDeviceTags {

    @Test
    public void testMobileDeviceTags() {
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