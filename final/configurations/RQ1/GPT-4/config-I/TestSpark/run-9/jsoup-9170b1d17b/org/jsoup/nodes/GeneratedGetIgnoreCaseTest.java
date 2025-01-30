package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        assertEquals("testVal1", attributes.getIgnoreCase("TESTKEY1"));
    }

}