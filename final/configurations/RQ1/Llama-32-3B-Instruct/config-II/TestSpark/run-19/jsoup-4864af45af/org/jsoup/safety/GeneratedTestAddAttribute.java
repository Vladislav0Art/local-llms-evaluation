package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestAddAttribute {

    @Test
    public void testAddAttribute() {
        Config config = new Config();
        config.add(All, "value1");
        config.add(All, "value2");

        Map<String, List<String>> attrs = config.getAttributes();
        assertTrue(attrs.containsKey(All));
        assertEquals(Arrays.asList("value1", "value2"), attrs.get(All));
    }

}