package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedAsListTest {

    @Test
    public void AsListTest() {
        Attributes attributes = new Attributes();
        List<Attribute> attrList = attributes.asList();
        assertEquals(0, attrList.size());

        attributes.put("key", "value");
        attrList = attributes.asList();
        assertEquals(1, attrList.size());
    }

}