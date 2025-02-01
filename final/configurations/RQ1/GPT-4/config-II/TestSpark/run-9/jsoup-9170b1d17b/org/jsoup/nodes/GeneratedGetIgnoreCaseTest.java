package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        String actual = attributes.getIgnoreCase("key");

        assertEquals("value", actual);
    }

}