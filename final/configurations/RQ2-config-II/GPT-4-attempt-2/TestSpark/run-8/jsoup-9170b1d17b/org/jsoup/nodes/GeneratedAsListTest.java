package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        List<Attribute> list = attributes.asList();
        assertEquals(1, list.size());
    }

}