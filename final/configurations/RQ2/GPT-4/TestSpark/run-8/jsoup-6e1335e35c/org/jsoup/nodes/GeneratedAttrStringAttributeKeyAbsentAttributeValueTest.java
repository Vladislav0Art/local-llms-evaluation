package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedAttrStringAttributeKeyAbsentAttributeValueTest {

    @Test
    public void attrStringAttributeKeyAbsentAttributeValueTest() {
        Element element = new Element(Tag.valueOf("p"), "http://www.test.com");
        String result = element.attr("absent");
        assertEquals("", result);
    }

}