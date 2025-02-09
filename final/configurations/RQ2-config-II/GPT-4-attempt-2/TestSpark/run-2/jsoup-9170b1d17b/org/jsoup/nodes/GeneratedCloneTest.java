package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clonedAttributes = attributes.clone();
        assertEquals(clonedAttributes.get("key"), attributes.get("key"));
    }

}