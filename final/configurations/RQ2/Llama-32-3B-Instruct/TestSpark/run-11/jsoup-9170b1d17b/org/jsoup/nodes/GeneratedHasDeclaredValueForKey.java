package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.internal.StringUtil;

public class GeneratedHasDeclaredValueForKey {

    @Test
    public void hasDeclaredValueForKey() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasDeclaredValueForKey("test"));
    }

}