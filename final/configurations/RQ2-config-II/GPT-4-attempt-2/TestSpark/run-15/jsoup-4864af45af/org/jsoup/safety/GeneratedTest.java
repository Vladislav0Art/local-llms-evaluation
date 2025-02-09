package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
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
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
        safelist.removeTags("div");
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        String tag = "p";
        String attr = "align";
        safelist.addAttributes(tag, attr);
        assertTrue(safelist.addAttributes(tag, attr).isTagAttributes("align"));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        String tag = "p";
        String attr = "align";
        safelist.addAttributes(tag, attr);
        safelist.removeAttributes(tag, attr);
        assertFalse(safelist.addAttributes(tag, attr).isTagAttributes("align"));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "img";
        String attr = "alt";
        safelist.addEnforcedAttribute(tag, attr, "alternate text");
        Attributes attrs = safelist.getEnforcedAttributes(tag);
        assertTrue(attrs.hasKey(attr));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "img";
        String attr = "alt";
        safelist.addEnforcedAttribute(tag, attr, "alternate text");
        safelist.removeEnforcedAttribute(tag, attr);
        Attributes attrs = safelist.getEnforcedAttributes(tag);
        assertFalse(attrs.hasKey(attr));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        String tag = "a";
        String attr = "href";
        safelist.addProtocols(tag, attr, "http");
        assertTrue(safelist.isSafeProtocol(tag, attr));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        String tag = "a";
        String attr = "href";
        safelist.addProtocols(tag, attr, "http");
        safelist.removeProtocols(tag, attr, "http");
        assertFalse(safelist.isSafeProtocol(tag, attr));
    }

}