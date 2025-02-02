package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConfig {

    @Test
    public void testConfig() {
        Config config = new Config();
        assertTrue(config.isPreserveRelativeLinks());
        assertFalse(config.isPreserveRelativeLinks());

        config.setPreserveRelativeLinks(true);
        assertTrue(config.isPreserveRelativeLinks());

        config.setPreserveRelativeLinks(false);
        assertFalse(config.isPreserveRelativeLinks());
    }

}