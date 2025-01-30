package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedCloneAttributesTest {

    @Test
    public void cloneAttributesTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes cloned = attributes.clone();
        assertTrue(attributes.equals(cloned));
        assertFalse(attributes == cloned);
    }

}