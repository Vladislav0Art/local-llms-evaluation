package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.internal.StringUtil;

public class GeneratedAdd {

    @Test
    public void add() {
        Attributes attributes = new Attributes();
        assertEquals(1, attributes.add("key", "value").size());
    }

}