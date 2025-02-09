package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedAttrBooleanTest {

    @Test
    public void attrBooleanTest() {
        Element element = new Element("testTag");
        element.attr("key", true);
        assertEquals("true", element.attr("key"));
    }

}