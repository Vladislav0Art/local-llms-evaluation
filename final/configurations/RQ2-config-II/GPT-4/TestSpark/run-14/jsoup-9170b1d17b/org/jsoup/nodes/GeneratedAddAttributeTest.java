package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedAddAttributeTest {

    @Test
    public void addAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key_two", "value_two");
        assertTrue(attributes.hasKey("key_two"));
    }

}