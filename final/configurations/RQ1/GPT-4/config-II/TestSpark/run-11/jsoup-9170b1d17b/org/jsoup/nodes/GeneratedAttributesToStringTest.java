package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesToStringTest {

    @Test
    public void attributesToStringTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(" key=\"value\"", attributes.toString());
    }

}