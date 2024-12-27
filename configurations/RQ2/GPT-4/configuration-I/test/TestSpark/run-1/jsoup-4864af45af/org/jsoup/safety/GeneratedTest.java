package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

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
    public void safelistDefaultConstructorTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist);
    }

    @Test
    public void safelistCopyConstructorTest() {
        Safelist safelist1 = Safelist.none();
        Safelist safelist2 = new Safelist(safelist1);
        assertNotNull(safelist2);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p");
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("p");
        assertFalse(safelist.isSafeTag("p"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "https://www.google.com")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "https://www.google.com")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "target", "_blank");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertTrue(attributes.hasKey("target"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeEnforcedAttribute("a", "target");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertFalse(attributes.hasKey("target"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "/relative/url")));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "https");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "https://www.google.com")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols("a", "href", "https");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "https://www.google.com")));
    }

}