package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGet {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.get("key1").equals("value1"));
        assertFalse(attributes.hasKey());
    }

}