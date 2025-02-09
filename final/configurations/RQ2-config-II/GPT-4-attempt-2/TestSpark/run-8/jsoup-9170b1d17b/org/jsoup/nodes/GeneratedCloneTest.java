package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Attributes clonedAttributes = attributes.clone();
        assertEquals(attributes, clonedAttributes);
    }

}