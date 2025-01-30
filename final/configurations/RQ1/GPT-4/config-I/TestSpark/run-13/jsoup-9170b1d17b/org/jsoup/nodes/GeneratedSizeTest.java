package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attr = new Attributes();
        assertEquals(0, attr.size());
        attr.put("Key", "Value");
        assertEquals(1, attr.size());
    }

}