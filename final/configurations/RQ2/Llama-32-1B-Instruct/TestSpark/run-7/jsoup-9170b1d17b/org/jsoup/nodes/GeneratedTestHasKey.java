package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestHasKey {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testHasKey() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKey());
        assertFalse(attributes.hasKey("nonExistentKey"));
    }

}