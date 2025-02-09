package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseValidKeyTest {

    @Test
    public void getIgnoreCaseValidKeyTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        assertEquals("testValue", attr.getIgnoreCase("TESTKEY"));
    }

}