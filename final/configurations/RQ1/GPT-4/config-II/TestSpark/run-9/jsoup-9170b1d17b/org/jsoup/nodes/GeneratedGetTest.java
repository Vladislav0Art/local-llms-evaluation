package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String actual = attributes.get("key");

        assertEquals("value", actual);
    }

}