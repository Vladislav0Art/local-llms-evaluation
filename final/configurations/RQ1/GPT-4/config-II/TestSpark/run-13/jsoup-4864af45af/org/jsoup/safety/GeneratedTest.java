package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "br");
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "br");
        safelist.removeTags("br");
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("br"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "a");
        safelist.addAttributes("a", "href");
        Attribute href = new Attribute("href", "https://google.com");
        Attribute style = new Attribute("style", "color:red");
        Element element = new Element("a").attr("href", "https://google.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        assertFalse(safelist.isSafeAttribute("p", element, style));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "a");
        safelist.addAttributes("a", "href", "style");
        safelist.removeAttributes("a", "href");
        Attribute href = new Attribute("href", "https://google.com");
        Attribute style = new Attribute("style", "color:red");
        Element element = new Element("a").attr("href", "https://google.com");
        assertFalse(safelist.isSafeAttribute("a", element, href));
        assertTrue(safelist.isSafeAttribute("a", element, style));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "a");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Element element = new Element("a").attr("rel", "nofollow");
        Element element1 = new Element("a").attr("rel", "follow");
        Attribute attribute = new Attribute("rel", "nofollow");
        Attribute attribute1 = new Attribute("rel", "follow");
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        assertFalse(safelist.isSafeAttribute("a", element1, attribute1));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "a");
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        safelist.removeEnforcedAttribute("a", "rel");
        Element element = new Element("a").attr("rel", "nofollow");
        Attribute attribute = new Attribute("rel", "nofollow");
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "https");
        Attribute href = new Attribute("href", "https://google.com");
        Attribute hrefUnsafe = new Attribute("href", "http://google.com");
        Element element = new Element("a").attr("href", "https://google.com");
        assertTrue(safelist.isSafeAttribute("a", element, href));
        assertFalse(safelist.isSafeAttribute("a", element, hrefUnsafe));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "https");
        safelist.removeProtocols("a", "href", "https");
        Attribute href = new Attribute("href", "https://google.com");
        Element element = new Element("a").attr("href", "https://google.com");
        assertFalse(safelist.isSafeAttribute("a", element, href));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "#");
        safelist.preserveRelativeLinks(true);
        Attribute href = new Attribute("href", "#section1");
        Element element = new Element("a").attr("href", "#section1");
        assertTrue(safelist.isSafeAttribute("a", element, href));
    }

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

    @Test
    public void safelistTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist);
    }

    @Test
    public void safelistCopyTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p");
        Safelist copy = new Safelist(safelist);
        assertTrue(copy.isSafeTag("p"));
    }

}