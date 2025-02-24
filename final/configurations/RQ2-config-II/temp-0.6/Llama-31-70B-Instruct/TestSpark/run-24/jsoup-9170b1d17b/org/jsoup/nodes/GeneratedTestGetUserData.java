package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestGetUserData {

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("testKey", "testValue");
        assertEquals("testValue", attributes.getUserData("testKey"));
    }

}