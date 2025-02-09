package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrBoolTest {

    @Test
    public void attrBoolTest() {
        Element element = new Element("div");
        element = element.attr("data-test", true);
        String attrValue = element.attr("data-test");
        assertEquals("true", attrValue);
    }

}