package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void setKeyGetKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");

        assertEquals("Value1", attributes.get("Key1"));
    }

    @Test
    public void setKeyGetKeyIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");

        assertEquals("Value1", attributes.getIgnoreCase("key1"));
    }

    @Test
    public void setKeyPutKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");
        attributes.put("Key1", "NewValue1");

        assertEquals("NewValue1", attributes.get("Key1"));
    }

    @Test
    public void setKeyPutUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");
        attributes.putUserData("Key1", "UserValue1");

        assertEquals("UserValue1", attributes.getUserData("Key1"));
    }

    @Test
    public void setKeyPutUserDataIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");
        attributes.putUserData("key1", "UserValue1");

        assertEquals("UserValue1", attributes.getUserData("Key1"));
    }

}