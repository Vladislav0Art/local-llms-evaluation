package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedGetUserDataTest {

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("testKey2", "testVal2");
        assertEquals("testVal2", attributes.getUserData("testKey2"));
    }

}