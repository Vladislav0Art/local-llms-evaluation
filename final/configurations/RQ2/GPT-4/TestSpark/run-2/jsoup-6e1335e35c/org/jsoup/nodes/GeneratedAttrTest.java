package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element e = new Element("p");
        e.attr("class", "test");
        assertEquals("test", e.attr("class"));
    }

}