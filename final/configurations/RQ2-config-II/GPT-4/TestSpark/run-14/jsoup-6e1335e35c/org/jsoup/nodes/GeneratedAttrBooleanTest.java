package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrBooleanTest {

    @Test
    public void attrBooleanTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.attr("booleanAttr", true);
        assertEquals("true", element.attr("booleanAttr"));
    }

}