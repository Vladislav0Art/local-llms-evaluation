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
        assertFalse(safelist.isSafeTag("html"));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("strong"));
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
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
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p");
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().asList().get(0);
        safelist.addProtocols("a", "href", "http");
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div");
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div");
        assertTrue(safelist.isSafeTag("div"));
        safelist.removeTags("div");
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "http://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").hasKey("href"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "http://example.com");
        assertTrue(safelist.getEnforcedAttributes("a").hasKey("href"));
        safelist.removeEnforcedAttribute("a", "href");
        assertFalse(safelist.getEnforcedAttributes("a").hasKey("href"));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.preserveRelativeLinks);
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.preserveRelativeLinks);
    }

}