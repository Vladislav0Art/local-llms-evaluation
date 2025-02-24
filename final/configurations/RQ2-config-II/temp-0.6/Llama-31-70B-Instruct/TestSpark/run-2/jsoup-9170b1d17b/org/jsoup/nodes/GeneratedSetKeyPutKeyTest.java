package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class GeneratedSetKeyPutKeyTest {

    @Test
    public void setKeyPutKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("Key1", "Value1");
        attributes.put("Key1", "NewValue1");

        assertEquals("NewValue1", attributes.get("Key1"));
    }

}