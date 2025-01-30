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
        assertFalse(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("blockquote"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("video"));
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        safelist.addTags("video");
        assertTrue(safelist.isSafeTag("video"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        safelist.removeTags("div");
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        safelist.addAttributes("a", "example");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("example", "example.com")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        safelist.addEnforcedAttribute("a", "enforced", "value");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("enforced", "value"), new Attribute("enforced", "value")));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addEnforcedAttribute("a", "enforced", "value");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("enforced", "value"), new Attribute("enforced", "value")));
        safelist.removeEnforcedAttribute("a", "enforced");
        assertFalse(safelist.isSafeAttribute("a", new Element("a").attr("enforced", "value"), new Attribute("enforced", "value")));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "ftp://example.com")));
        safelist.addProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "ftp://example.com")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "http://example.com")));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.relaxed();
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "/example")));
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "/example")));
    }

}