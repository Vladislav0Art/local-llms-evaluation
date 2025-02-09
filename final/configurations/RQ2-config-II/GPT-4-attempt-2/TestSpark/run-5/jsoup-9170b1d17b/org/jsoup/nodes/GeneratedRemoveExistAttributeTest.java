package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveExistAttributeTest {

    @Test
    public void removeExistAttributeTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        attr.remove("testKey");
        assertFalse(attr.hasKey("testKey"));
    }

}