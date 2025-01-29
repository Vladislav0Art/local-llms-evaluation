package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestAdd {

    @Test
    public void testAdd() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.addUserData("key2", "userDataValue");
        assertTrue(attributes.get("key1").equals("value1"));
        assertTrue(attributes.getUserData("key2").equals("userDataValue"));
    }

}