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
    public void Safelist_CopyTest() {
        Safelist original = Safelist.basic();
        Safelist copy = new Safelist(original);
        assertNotNull(copy);
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
        safelist.removeTags("p");
        assertFalse(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertEquals(2, attributes.size());
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        safelist.removeAttributes("a", "href");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertEquals(1, attributes.size());
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "http://example.com");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertEquals(1, attributes.size());
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "http://example.com");
        safelist.removeEnforcedAttribute("a", "href");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertTrue(attributes.isEmpty());
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertEquals(2, attributes.size());
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "http");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertEquals(1, attributes.size());
    }

}