package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedAttrStringAttributeKeyStringAttributeValueTest {

    @Test
    public void attrStringAttributeKeyStringAttributeValueTest() {
        Element element = new Element(Tag.valueOf("p"), "http://www.test.com");
        Element result = element.attr("attr", "value");
        assertEquals("value", result.attr("attr"));
        assertEquals(element, result);
    }

}