package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestAddUserData {

    @Test
    public void testAddUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("userKey", "userDataValue");
        attributes.addUserData("nonExistentKey", "dataVal");
        assertFalse(attributes.hasDeclaredValueForKey("key1"));
        assertTrue(attributes.getUserData("userKey").equals("userDataValue"));
    }

}