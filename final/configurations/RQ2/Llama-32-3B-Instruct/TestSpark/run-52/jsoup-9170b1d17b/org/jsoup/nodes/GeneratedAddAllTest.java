package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("test", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("anotherTest", "anotherValue");
        attributes1.addAll(attributes2);
        assertEquals(2, attributes1.size());
    }

}