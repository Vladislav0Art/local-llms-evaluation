package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        Attributes incomingAttributes = new Attributes();
        incomingAttributes.put("key", "value");
        attributes.addAll(incomingAttributes);
        assertTrue(attributes.hasKey("key"));
    }

}