package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasKeyTrueTest {

    @Test
    public void hasKeyTrueTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        assertTrue(attr.hasKey("testKey"));
    }

}