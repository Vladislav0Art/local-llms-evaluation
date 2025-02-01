package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes clonedAttributes = attributes.clone();
        attributes.remove("key");

        assertTrue(clonedAttributes.hasKey("key"));
        assertFalse(attributes.hasKey("key"));
    }

}