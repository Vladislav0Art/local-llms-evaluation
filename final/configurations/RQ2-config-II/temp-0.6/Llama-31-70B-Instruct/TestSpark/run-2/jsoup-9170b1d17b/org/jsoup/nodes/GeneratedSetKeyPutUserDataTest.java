package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class GeneratedSetKeyPutUserDataTest {

    @Test
    public void setKeyPutUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");
        attributes.putUserData("Key1", "UserValue1");

        assertEquals("UserValue1", attributes.getUserData("Key1"));
    }

}