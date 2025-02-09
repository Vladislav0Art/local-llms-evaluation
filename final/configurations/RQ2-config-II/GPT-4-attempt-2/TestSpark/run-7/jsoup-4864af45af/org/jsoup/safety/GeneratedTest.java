package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
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
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "a");
        safelist.removeTags("a");
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("title")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        safelist.removeAttributes("a", "title");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href")));
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("title")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertTrue(attributes.hasKey("rel"));
        assertEquals("nofollow", attributes.get("rel"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        safelist.removeEnforcedAttribute("a", "rel");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertFalse(attributes.hasKey("rel"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "/relative/url")));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "https", "ftp");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://secure-url")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://old-url")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "https", "ftp");
        safelist.removeProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://secure-url")));
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://old-url")));
    }

}