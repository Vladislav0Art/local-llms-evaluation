package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String string = attributes.toString();
        assertTrue(string.contains("key=\"value\""));
    }

}