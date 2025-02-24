package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPutUserData {

    @Test
    public void testPutUserData() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("key1"));

        attributes.putUserData("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

}