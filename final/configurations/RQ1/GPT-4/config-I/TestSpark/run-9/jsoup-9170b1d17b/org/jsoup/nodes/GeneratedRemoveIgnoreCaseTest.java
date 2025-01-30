package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("testKey1", "testVal1");
        attributes.removeIgnoreCase("TESTKEY1");
        assertFalse(attributes.hasKey("testKey1"));
    }

}