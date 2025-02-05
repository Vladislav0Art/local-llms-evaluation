package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");

        ArrayList<Attribute> list = (ArrayList<Attribute>) attributes.asList();

        Attribute attribute = list.get(0);
        assertEquals("key", attribute.getKey());
        assertEquals("value", attribute.getValue());
    }

}