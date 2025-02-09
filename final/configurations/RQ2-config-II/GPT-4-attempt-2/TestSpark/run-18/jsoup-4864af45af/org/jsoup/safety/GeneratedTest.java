package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
        safelist.addTags("h1", "h2");
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("h1", "h2");
        safelist.removeTags("h2");
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        safelist.removeAttributes("a", "title");
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");
        safelist.removeEnforcedAttribute("a", "rel");
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
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "https");
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("h1");
        assertTrue(safelist.isSafeTag("h1"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");

        Element mockElement = mock(Element.class);
        Attribute mockAttribute = mock(Attribute.class);
        when(mockAttribute.getKey()).thenReturn("href");

        assertTrue(safelist.isSafeAttribute("a", mockElement, mockAttribute));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist.getEnforcedAttributes("a"));
    }

}