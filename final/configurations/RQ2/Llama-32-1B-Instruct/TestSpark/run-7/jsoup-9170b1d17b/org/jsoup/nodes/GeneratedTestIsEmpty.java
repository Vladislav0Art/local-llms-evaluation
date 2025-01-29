package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestIsEmpty {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testIsEmpty() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.isEmpty());
        attributes.remove("key1");
        assertFalse(attributes.isEmpty());
    }

}