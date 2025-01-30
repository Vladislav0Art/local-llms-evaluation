package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attr1 = new Attributes();
        attr1.put("Key", "Value");
        Attributes attr2 = new Attributes();
        attr2.put("Key", "Value");
        assertTrue(attr1.equals(attr2));
    }

}