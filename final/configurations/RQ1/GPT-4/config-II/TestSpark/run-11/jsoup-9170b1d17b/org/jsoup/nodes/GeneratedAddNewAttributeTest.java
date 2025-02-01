package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddNewAttributeTest {

    @Test
    public void addNewAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}