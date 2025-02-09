package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void noneTest() {
        assertNotNull(Safelist.none());
    }

    @Test
    public void simpleTextTest() {
        assertNotNull(Safelist.simpleText());
    }

    @Test
    public void basicTest() {
        assertNotNull(Safelist.basic());
    }

    @Test
    public void basicWithImagesTest() {
        assertNotNull(Safelist.basicWithImages());
    }

    @Test
    public void relaxedTest() {
        assertNotNull(Safelist.relaxed());
    }

    @Test
    public void constructorTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist);
    }

    @Test
    public void constructorCopyTest() {
        Safelist safelist = new Safelist(Safelist.basic());
        assertNotNull(safelist);
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "br");
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("br"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeTags("p", "br");
        assertTrue(!safelist.isSafeTag("p"));
        assertTrue(!safelist.isSafeTag("br"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "class", "id");
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("p", "class", "id");
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("p", "class", "value");
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeEnforcedAttribute("p", "class");
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
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols("a", "href", "http", "https");
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        Element element = new Element("p");
        Attribute attribute = new Attribute("class", "value");
        assertTrue(safelist.isSafeAttribute("p", element, attribute));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist.getEnforcedAttributes("p"));
    }

}