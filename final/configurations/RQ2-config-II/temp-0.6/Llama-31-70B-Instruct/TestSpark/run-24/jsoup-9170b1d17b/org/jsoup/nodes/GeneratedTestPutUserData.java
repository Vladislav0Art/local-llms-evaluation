package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("testKey", "testValue");
        assertEquals("testValue", attributes.getUserData("testKey"));
    }

}