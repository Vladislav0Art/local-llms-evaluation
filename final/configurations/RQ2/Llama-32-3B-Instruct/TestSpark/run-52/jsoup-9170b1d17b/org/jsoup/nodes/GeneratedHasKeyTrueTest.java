package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedHasKeyTrueTest {

    @Test
    public void hasKeyTrueTest() {
        Attributes attributes = new Attributes();
        attributes.add("test", "value");
        assertTrue(attributes.hasKey("test"));
    }

}