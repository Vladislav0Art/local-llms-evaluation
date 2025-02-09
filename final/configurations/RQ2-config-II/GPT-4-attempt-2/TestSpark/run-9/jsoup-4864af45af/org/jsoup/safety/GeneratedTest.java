package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("tag"));
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
        assertTrue(safelist.isSafeTag("h1"));
    }

    @Test
    public void constructorTest() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeTag("tag"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        assertTrue(safelist.isSafeTag("tag1"));
        assertTrue(safelist.isSafeTag("tag2"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeTags("a");
        assertFalse(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag", "attr1", "attr2");
        assertTrue(safelist.isSafeAttribute("tag", null, null));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", null, null));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attr", "value");
        Attributes attributes = safelist.getEnforcedAttributes("tag");
        assertEquals("value", attributes.get("attr"));
        assertTrue(safelist.isSafeAttribute("tag", null, null));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("a", "href");
        Attributes attributes = safelist.getEnforcedAttributes("a");
        assertFalse(attributes.hasKey("href"));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("a", null, null));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag", "attr", "http", "https");
        assertTrue(safelist.isSafeAttribute("tag", null, null));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", null, null));
    }

}