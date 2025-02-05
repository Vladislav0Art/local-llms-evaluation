package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedHasDeclaredValueForKeyTest {

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key_six", null);
        assertFalse(attributes.hasDeclaredValueForKey("key_six"));
    }

}