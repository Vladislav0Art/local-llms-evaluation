package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestHasDeclaredValueForKey {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        attributes.addUserData("userKey", "userDataValue");
        assertTrue(attributes.hasDeclaredValueForKey("KEY1"));
        assertFalse(attributes.hasDeclaredValueForKey("nonExistentKey"));
    }

}