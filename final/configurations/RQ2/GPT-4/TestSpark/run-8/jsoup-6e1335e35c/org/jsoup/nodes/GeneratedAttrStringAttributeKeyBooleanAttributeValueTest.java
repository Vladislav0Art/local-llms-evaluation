package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedAttrStringAttributeKeyBooleanAttributeValueTest {

    @Test
    public void attrStringAttributeKeyBooleanAttributeValueTest() {
        Element element = new Element(Tag.valueOf("p"), "http://www.test.com");
        Element result = element.attr("bool", true);
        assertEquals("true", result.attr("bool"));
        assertEquals(element, result);
    }

}