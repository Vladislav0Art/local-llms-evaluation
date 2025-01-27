package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.internal.StringUtil;

public class GeneratedClone {

    @Test
    public void clone() {
        Attributes original = new Attributes();
        Attributes copy = original.clone();
        assertNotNull(copy);
        assertEquals(original, copy);
    }

}