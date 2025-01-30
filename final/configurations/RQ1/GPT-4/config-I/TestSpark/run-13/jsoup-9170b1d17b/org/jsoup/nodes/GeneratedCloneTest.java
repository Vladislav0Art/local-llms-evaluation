package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attr = new Attributes();
        attr.put("Key", "Value");
        Attributes cloned = attr.clone();
        assertEquals(attr, cloned);
    }

}