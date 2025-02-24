package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        String actualTagName = element.tagName();
        assertEquals("tag", actualTagName);
    }

}