package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.internal.StringUtil;

public class GeneratedGetIgnoreCase {

    @Test
    public void getIgnoreCase() {
        Attributes attributes = new Attributes();
        assertEquals("test", attributes.getIgnoreCase("tesT"));
    }

}