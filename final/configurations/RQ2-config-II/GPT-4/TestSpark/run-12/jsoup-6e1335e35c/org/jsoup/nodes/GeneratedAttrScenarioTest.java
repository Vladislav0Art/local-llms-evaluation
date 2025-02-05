package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

public class GeneratedAttrScenarioTest {

    @Test
    public void attrScenarioTest() {
        Element el = new Element("testName");
        el.attr("testAttr", "testValue");
        assertEquals("testValue", el.attr("testAttr"));
    }

}