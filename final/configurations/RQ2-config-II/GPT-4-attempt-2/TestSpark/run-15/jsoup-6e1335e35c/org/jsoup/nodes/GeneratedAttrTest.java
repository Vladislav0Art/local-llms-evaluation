package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element = element.attr("class", "testClass");
        String attrValue = element.attr("class");
        assertEquals("testClass", attrValue);
    }

}