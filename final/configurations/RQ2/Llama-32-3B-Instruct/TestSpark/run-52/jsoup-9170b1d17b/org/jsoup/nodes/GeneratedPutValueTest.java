package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;

import java.util.List;

public class GeneratedPutValueTest {

    @Test
    public void putValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("value", attributes.get("test"));
    }

}