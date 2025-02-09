package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagNameWithParamTest {

    @Test
    public void tagNameWithParamTest() {
        Element element = new Element("div");
        Element otherElement = element.tagName("span");
        String tagName = otherElement.tagName();
        assertEquals("span", tagName);
    }

}