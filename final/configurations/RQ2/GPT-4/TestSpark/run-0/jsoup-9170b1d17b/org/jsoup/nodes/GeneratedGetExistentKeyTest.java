package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedGetExistentKeyTest {

    @Test
    public void getExistentKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("existent", "value");
        assertEquals("value", attributes.get("existent"));
    }

}