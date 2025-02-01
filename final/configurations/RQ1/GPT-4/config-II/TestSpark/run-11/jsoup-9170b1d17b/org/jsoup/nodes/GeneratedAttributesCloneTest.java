package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesCloneTest {

    @Test
    public void attributesCloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes cloneAttributes = attributes.clone();
        assertTrue(cloneAttributes.hasKey("key"));
    }

}