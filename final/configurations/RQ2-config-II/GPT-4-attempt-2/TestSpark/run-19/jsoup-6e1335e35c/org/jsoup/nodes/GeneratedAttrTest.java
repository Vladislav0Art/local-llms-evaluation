package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("testTag");
        element.attr("key", "value");
        assertEquals("value", element.attr("key"));
    }

}