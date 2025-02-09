package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        Attributes cloneAttr = attr.clone();
        assertEquals(cloneAttr.get("testKey"), attr.get("testKey"));
    }

}