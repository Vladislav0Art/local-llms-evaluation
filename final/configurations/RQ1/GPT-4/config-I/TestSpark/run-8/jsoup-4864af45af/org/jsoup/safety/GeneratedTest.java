package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
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
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("tag1", "tag2");
        assertTrue(safelist.isSafeTag("tag1"));
        assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeTags("b");
        assertFalse(safelist.isSafeTag("b"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("tag", "attribute");
        Element element = new Element("tag");
        element.attr("attribute", "value");
        Attributes attrs = element.attributes();
        assertTrue(safelist.isSafeAttribute("tag", element, attrs.iterator().next()));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "http://test.com");
        Attributes attrs = element.attributes();
        assertFalse(safelist.isSafeAttribute("a", element, attrs.iterator().next()));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        Attributes attrs = safelist.getEnforcedAttributes("tag");
        assertTrue(attrs.hasKey("attribute"));
        assertEquals("value", attrs.get("attribute"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        safelist.removeEnforcedAttribute("a", "rel");
        Attributes attrs = safelist.getEnforcedAttributes("a");
        assertFalse(attrs.hasKey("rel"));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        Element element = new Element("a");
        element.attr("href", "http://example.com");
        Attributes attrs = element.attributes();
        assertTrue(safelist.isSafeAttribute("a", element, attrs.iterator().next()));
    }

}