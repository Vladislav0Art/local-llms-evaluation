package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("div", new Element("div"), new Attribute("class", "test")));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
        assertTrue(safelist.isSafeTag("em"));
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("iframe"));
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("iframe"));
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("iframe"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeTag("div"));
        safelist.addTags("div");
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        safelist.removeTags("div");
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void addRemoveAttributesTest() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeAttribute("div", new Element("div"), new Attribute("class", "test")));

        safelist.addAttributes("div", "class");
        assertTrue(safelist.isSafeAttribute("div", new Element("div"), new Attribute("class", "test")));

        safelist.removeAttributes("div", "class");
        assertFalse(safelist.isSafeAttribute("div", new Element("div"), new Attribute("class", "test")));
    }

    @Test
    public void addRemoveEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertFalse(attributes.hasKey("class"));

        safelist.addEnforcedAttribute("p", "class", "test");
        attributes = safelist.getEnforcedAttributes("p");
        assertTrue(attributes.hasKey("class"));

        safelist.removeEnforcedAttribute("p", "class");
        attributes = safelist.getEnforcedAttributes("p");
        assertFalse(attributes.hasKey("class"));
    }

    @Test
    public void addRemoveProtocolsTest() {
        Safelist safelist = new Safelist().addTags("a").addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("href", "http://google.com"), new Attribute("href", "http://google.com")));

        safelist.addProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("href", "ftp://google.com"), new Attribute("href", "ftp://google.com")));

        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", new Element("a").attr("href", "http://google.com"), new Attribute("href", "http://google.com")));
    }

}