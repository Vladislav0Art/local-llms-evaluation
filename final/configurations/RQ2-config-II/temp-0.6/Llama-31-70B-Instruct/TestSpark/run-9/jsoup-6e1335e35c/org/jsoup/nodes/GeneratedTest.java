package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("tag");
        String actualTagName = element.tagName();
        assertEquals("tag", actualTagName);
    }

    @Test
    public void normalNameTest() {
        Element element = new Element("tag");
        String actualNormalName = element.normalName();
        assertEquals("tag", actualNormalName);
    }

    @Test
    public void tagNameWithBaseUriTest() {
        Element element = new Element("tag", "baseUri");
        String actualTagName = element.tagName();
        assertEquals("tag", actualTagName);
    }

    @Test
    public void normalNameWithBaseUriTest() {
        Element element = new Element("tag", "baseUri");
        String actualNormalName = element.normalName();
        assertEquals("tag", actualNormalName);
    }

    @Test
    public void tagNameWithBaseUriAndAttributesTest() {
        Element element = new Element("tag", "baseUri", null);
        String actualTagName = element.tagName();
        assertEquals("tag", actualTagName);
    }

    @Test
    public void normalNameWithBaseUriAndAttributesTest() {
        Element element = new Element("tag", "baseUri", null);
        String actualNormalName = element.normalName();
        assertEquals("tag", actualNormalName);
    }

}