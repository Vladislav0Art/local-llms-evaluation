package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");

        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value2");

        attributes1.addAll(attributes2);
        assertEquals(2, attributes1.size());
    }

}