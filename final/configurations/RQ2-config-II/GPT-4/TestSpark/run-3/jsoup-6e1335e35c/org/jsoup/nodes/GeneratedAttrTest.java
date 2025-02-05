package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("tag");
        element.attr("attributeKey", "attributeValue");
        assertEquals("attributeValue", element.attr("attributeKey"));
    }

}