package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrBooleanTest {

    @Test
    public void attrBooleanTest() {
        Element elem = new Element("div");
        elem.attr("customAttr", true);
        assertEquals("true", elem.attr("customAttr"));
    }

}