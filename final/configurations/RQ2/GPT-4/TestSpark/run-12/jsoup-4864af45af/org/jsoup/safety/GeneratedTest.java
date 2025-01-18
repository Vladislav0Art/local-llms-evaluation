package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
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
    public void safelistConstructorTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist);
    }

    @Test
    public void safelistWithCopyTest() {
        Safelist original = new Safelist();
        Safelist copy = new Safelist(original);
        assertNotNull(original);
        assertNotNull(copy);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.removeTags("div", "p");
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "id", "class");
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.removeAttributes("div", "id", "class");
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("div", "id", "val");
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.removeEnforcedAttribute("div", "id");
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.removeProtocols("a", "href", "http", "https");
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        boolean result = safelist.isSafeTag("div");
        assertFalse(result);
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Element el = new Element("div");
        Attribute attr = new Attribute("id", "val");
        boolean result = safelist.isSafeAttribute("div", el, attr);
        assertTrue(result);
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        Attributes result = safelist.getEnforcedAttributes("div");
        assertNotNull(result);
    }

}