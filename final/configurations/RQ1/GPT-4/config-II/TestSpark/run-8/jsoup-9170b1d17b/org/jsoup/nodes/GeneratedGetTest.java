package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        assertEquals("value", attributes.get("key"));
    }

}