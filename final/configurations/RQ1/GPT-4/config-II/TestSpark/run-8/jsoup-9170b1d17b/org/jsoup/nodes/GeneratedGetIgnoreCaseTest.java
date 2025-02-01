package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

}