package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestWifiAccessPointTags {

    @Test
    public void testWifiAccessPointTags() {
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

}