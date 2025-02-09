package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
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
    public void addTagsTest() {
        Safelist safelist = new Safelist();

        safelist.addTags("p", "a");

        // No API to verify the addition, so checking with safety function
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.basic();

        assertTrue(safelist.isSafeTag("a"));
        safelist.removeTags("a");

        assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();

        safelist.addAttributes("a", "href");

        Element element = new Element("a");
        Attribute attr = new Attribute("href", "http://example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attr));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();

        Element element = new Element("a");
        Attribute attr = new Attribute("href", "http://example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attr));

        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", element, attr));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();

        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        assertEquals("nofollow", safelist.getEnforcedAttributes("a").get("rel"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();

        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        assertEquals("nofollow", safelist.getEnforcedAttributes("a").get("rel"));

        safelist.removeEnforcedAttribute("a", "rel");
        assertNull(safelist.getEnforcedAttributes("a").get("rel"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();

        // No public API to verify, relying on internal usage
        safelist.preserveRelativeLinks(true);
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();

        safelist.addProtocols("a", "href", "http", "https");

        // No public API to verify, relying on internal usage
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();

        safelist.removeProtocols("a", "href", "http");

        // No public API to verify, relying on internal usage
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = Safelist.basic();

        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.basic();

        Element element = new Element("a");
        Attribute attr = new Attribute("href", "http://example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attr));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();

        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        assertEquals("nofollow", safelist.getEnforcedAttributes("a").get("rel"));
    }

}