package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertEquals(1, attr.asList().size());
    }

}