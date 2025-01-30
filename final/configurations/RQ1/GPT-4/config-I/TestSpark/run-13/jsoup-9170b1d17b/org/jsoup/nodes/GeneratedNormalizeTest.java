package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attr = new Attributes();
        attr.add("KEY", "Value");
        attr.normalize();
        assertTrue(attr.hasKey("key"));
    }

}