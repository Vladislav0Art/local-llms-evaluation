package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestAddAll {

    public String internalKey(String key) {
        return lowerCase(key);
    }

    public String lowerCase(String s) {
        return StringUtil.toLowerCase(s);
    }

    @Test
    public void testAddAll() {
        Attributes attributes = new Attributes();
        attributes.putUserData("userKey", "userDataValue");
        Attributes otherAttributes = new Attributes();
        otherAttributes.addUserData("otherKey", "otherUserDataValue");
        assertTrue(attributes.addAll(otherAttributes).get("key1").equals("otherUserDataValue"));
    }

}