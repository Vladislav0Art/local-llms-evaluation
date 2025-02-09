package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPutNewKeyTest {

    @Test
    public void putNewKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("newKey", "newVal");
        assertEquals("newVal", attributes.get("newKey"));
    }

}