package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class GeneratedTagNameWithBaseUriTest {

    @Test
    public void tagNameWithBaseUriTest() {
        Element element = new Element("tag", "baseUri");
        String actualTagName = element.tagName();
        assertEquals("tag", actualTagName);
    }

}