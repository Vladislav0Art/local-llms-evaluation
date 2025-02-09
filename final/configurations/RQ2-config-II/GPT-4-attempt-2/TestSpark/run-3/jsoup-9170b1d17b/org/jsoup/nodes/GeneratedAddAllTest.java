package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.jsoup.nodes.Attributes.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");

        Attributes attributesToAdd = new Attributes();
        attributesToAdd.put("key2", "value2");

        attributes.addAll(attributesToAdd);
        assertEquals(2, attributes.size());
        assertTrue(attributes.hasKey("key1"));
        assertTrue(attributes.hasKey("key2"));
    }

}