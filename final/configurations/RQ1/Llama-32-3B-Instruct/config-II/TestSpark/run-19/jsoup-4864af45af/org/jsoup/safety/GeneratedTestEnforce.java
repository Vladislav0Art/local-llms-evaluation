package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestEnforce {

    @Test
    public void testEnforce() {
        Config config = new Config();
        config.enforce(All, "key1");
        config.enforce(All, "key2");

        Map<String, Attributes> enforced = config.getEnforcedAttributes();
        assertTrue(enforced.containsKey(All));
        assertEquals(Arrays.asList("key1", "key2"), enforced.get(All).getKeys());
    }

}