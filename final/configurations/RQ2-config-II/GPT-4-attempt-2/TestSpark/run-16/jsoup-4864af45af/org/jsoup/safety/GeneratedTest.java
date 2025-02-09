package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("script"));
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
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none().addTags("tag");
        assertTrue(safelist.isSafeTag("tag"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.simpleText().removeTags("b");
        assertFalse(safelist.isSafeTag("b"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none().addTags("div").addAttributes("div", "attr");
        Element el = new Element("div");
        el.attr("attr", "value");
        Attribute attr = el.attributes().get(0);
        assertTrue(safelist.isSafeAttribute("div", el, attr));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic().removeAttributes("a", "href");
        Element el = new Element("a");
        el.attr("href", "www.google.com");
        Attribute attr = el.attributes().get(0);
        assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().addEnforcedAttribute("a", "target", "_blank");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertTrue(attributes.hasKey("target"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().removeEnforcedAttribute("a", "rel");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertFalse(attributes.hasKey("rel"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        String[] removeProtocols = {"http", "https"};
        safelist = safelist.removeProtocols("a", "href", removeProtocols);
        Element el = new Element("a");
        el.attr("href", "/relative/link");
        Attribute attr = el.attributes().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none().addProtocols("a", "href", "ftp");
        Element el = new Element("a");
        el.attr("href", "ftp://ftp.google.com");
        Attribute attr = el.attributes().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic().removeProtocols("a", "href", "http");
        Element el = new Element("a");
        el.attr("href", "http://www.google.com");
        Attribute attr = el.attributes().get(0);
        assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}