package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasKeyFalseTest {

    @Test
    public void hasKeyFalseTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        assertFalse(attr.hasKey("InvalidKey"));
    }

}