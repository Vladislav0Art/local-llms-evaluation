package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrBooleanTest {

    @Test
    public void attrBooleanTest() {
        Element element = new Element("tag");
        element.attr("attributeKey", true);
        assertEquals("true", element.attr("attributeKey"));
    }

}