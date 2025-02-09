package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertTrue(safelist.isSafeTag("tag1"));
        assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("div");
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        Element el = new Element("tag");
        el.attr("attr1", "value1");
        assertTrue(safelist.isSafeAttribute("tag", el, new Attribute("attr1", "value1")));
        assertTrue(safelist.isSafeAttribute("tag", el, new Attribute("attr2", "value2")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        Element el = new Element("div");
        el.attr("style", "color: red");
        safelist.removeAttributes("div", "style");
        assertFalse(safelist.isSafeAttribute("div", el, new Attribute("style", "color: red")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attr", "value");
        assertEquals("value", safelist.getEnforcedAttributes("tag").get("attr"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeEnforcedAttribute("a", "rel");
        assertNull(safelist.getEnforcedAttributes("a").get("rel"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("href", "/home"), new Attribute("href", "/home")));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("href", "ftp://example.com"), new Attribute("href", "ftp://example.com")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", new Element("a").attr("href", "http://example.com"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertEquals("nofollow", safelist.getEnforcedAttributes("a").get("rel"));
    }

}