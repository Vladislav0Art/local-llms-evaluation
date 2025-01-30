package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        attr.remove("Key");
        assertFalse(attr.hasKey("Key"));
    }

}