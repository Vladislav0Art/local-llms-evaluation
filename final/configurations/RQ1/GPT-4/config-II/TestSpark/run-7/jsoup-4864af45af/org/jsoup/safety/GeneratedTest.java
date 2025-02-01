package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
        assertTrue(safelist.isSafeTag("em"));
        assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        Attribute style = new Attribute("style", "width:100px");

        assertTrue(safelist.isSafeAttribute("a", element, href));
        assertFalse(safelist.isSafeAttribute("a", element, style));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div", "span");
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("span"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
        safelist.removeTags("b");
        assertFalse(safelist.isSafeTag("b"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div");
        safelist.addAttributes("div", "style");
        Element element = new Element("div");
        Attribute style = new Attribute("style", "width:100px");
        assertTrue(safelist.isSafeAttribute("div", element, style));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", element, href));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div");
        safelist.addEnforcedAttribute("div", "style", "width:100px");
        Element element = new Element("div");
        Attribute style = new Attribute("style", "width:100px");
        assertTrue(safelist.isSafeAttribute("div", element, style));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div");
        safelist.addEnforcedAttribute("div", "style", "width:100px");
        Element element = new Element("div");
        Attribute style = new Attribute("style", "width:100px");
        assertTrue(safelist.isSafeAttribute("div", element, style));
        safelist.removeEnforcedAttribute("div", "style");
        assertFalse(safelist.isSafeAttribute("div", element, style));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "http");
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        Element element = new Element("a");
        Attribute href = new Attribute("href", "http://example.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", element, href));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(true);
        Element element = new Element("a");
        Attribute href = new Attribute("href", "/example");
        assertTrue(safelist.isSafeAttribute("a", element, href));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div");
        safelist.addEnforcedAttribute("div", "style", "width:100px");
        assertTrue(safelist.getEnforcedAttributes("div").hasKey("style"));
    }

}