package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestRemove {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.remove("key2");
        assertTrue(attributes.isEmpty());
    }

}