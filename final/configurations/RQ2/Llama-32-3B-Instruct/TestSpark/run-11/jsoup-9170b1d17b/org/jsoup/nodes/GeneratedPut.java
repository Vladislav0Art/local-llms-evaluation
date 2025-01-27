package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.internal.StringUtil;

public class GeneratedPut {

    @Test
    public void put() {
        Attributes attributes = new Attributes();
        assertEquals(1, attributes.put("key", "value").size());
    }

}