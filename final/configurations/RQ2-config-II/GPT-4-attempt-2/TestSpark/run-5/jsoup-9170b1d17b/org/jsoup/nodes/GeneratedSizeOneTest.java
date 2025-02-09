package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSizeOneTest {

    @Test
    public void sizeOneTest() {
        Attributes attr = new Attributes();
        attr.put("testKey", "testValue");
        assertEquals(1, attr.size());
    }

}