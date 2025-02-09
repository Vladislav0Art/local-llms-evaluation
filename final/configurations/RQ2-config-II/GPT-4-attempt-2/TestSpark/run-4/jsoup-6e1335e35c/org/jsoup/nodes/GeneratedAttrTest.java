package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("attributeKey", "attributeValue");
        Element elementBoolean = new Element("div");
        elementBoolean.attr("attributeKey", true);
        assertEquals("attributeValue", element.attr("attributeKey"));
        assertEquals("true", elementBoolean.attr("attributeKey"));
    }

}