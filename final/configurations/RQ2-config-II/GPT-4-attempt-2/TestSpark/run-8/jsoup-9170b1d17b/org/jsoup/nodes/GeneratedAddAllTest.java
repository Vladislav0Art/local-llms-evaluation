package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        Attributes attributes2 = new Attributes();

        attributes1.add("key1", "value1");
        attributes1.add("key2", "value2");
        attributes2.add("key3", "value3");

        attributes1.addAll(attributes2);
        assertTrue(attributes1.hasKey("key3"));
    }

}