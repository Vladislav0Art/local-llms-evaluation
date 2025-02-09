package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetUserDataTest {

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        assertEquals("value", attributes.getUserData("key"));
    }

}