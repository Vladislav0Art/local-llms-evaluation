package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributesOriginal = new Attributes();
        attributesOriginal.add("key1", "value1");
        Attributes attributesClone = attributesOriginal.clone();
        assertEquals(attributesOriginal, attributesClone);
        assertNotSame(attributesOriginal, attributesClone);
    }

}