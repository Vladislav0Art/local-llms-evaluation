package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        assertNotEquals(0, attr.hashCode());
    }

}