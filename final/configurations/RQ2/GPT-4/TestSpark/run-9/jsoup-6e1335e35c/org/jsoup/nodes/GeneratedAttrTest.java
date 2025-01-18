package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element elem = new Element("div");
        elem.attr("customAttr", "attrValue");
        assertEquals("attrValue", elem.attr("customAttr"));
    }

}