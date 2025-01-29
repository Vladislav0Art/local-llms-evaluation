package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetUserData {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.addUserData("userKey", "userDataValue");
        assertTrue(attributes.getUserData("userKey").equals("userDataValue"));
        assertFalse(attributes.hasDeclaredValueForKey());
    }

}