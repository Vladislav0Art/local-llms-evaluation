package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedGetLowerCaseTest {

    @Test
    public void getLowerCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("test", "value");
        assertEquals("value", attributes.getIgnoreCase("test"));
    }

}