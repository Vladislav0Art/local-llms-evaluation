package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class GeneratedTagNameWithBaseUriAndAttributesTest {

    @Test
    public void tagNameWithBaseUriAndAttributesTest() {
        Element element = new Element("tag", "baseUri", null);
        String actualTagName = element.tagName();
        assertEquals("tag", actualTagName);
    }

}