package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestHasDeclaredValueForKeyIgnoreCase {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key2", "userDataValue");
        assertTrue(attributes.hasDeclaredValueForKeyIgnoreCase("KEY1"));
        assertFalse(attributes.hasDeclaredValueForKeyIgnoreCase("nonExistentKey"));
    }

    public String checkEmptyAttribute(Attributes attributes, String attribute) {
        if (attributes.containsKey(attribute)) {
            return internalKey(attribute);
        } else {
            return "";
        }
    }

}