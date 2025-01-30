package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attr = new Attributes();
        assertTrue(attr.isEmpty());
        attr.put("Key", "Value");
        assertFalse(attr.isEmpty());
    }

}