package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesAddAllTest {

    @Test
    public void attributesAddAllTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes newAttributes = new Attributes();
        newAttributes.addAll(attributes);
        assertEquals("value", newAttributes.get("key"));
    }

}