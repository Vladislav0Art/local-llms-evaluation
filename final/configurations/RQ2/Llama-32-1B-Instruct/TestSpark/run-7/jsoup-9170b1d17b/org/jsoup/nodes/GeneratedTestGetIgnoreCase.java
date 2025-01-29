package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetIgnoreCase {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.put("KEY1", "Value 1");
        attributes.put("key2", "Value 2");
        assertTrue(attributes.getIgnoreCase("KEY1").equals("value 1"));
        assertFalse(attributes.hasKeyIgnoreCase());
    }

}