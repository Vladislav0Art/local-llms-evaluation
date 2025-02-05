package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void addTagsTest() {
        Safelist safelist = new Safelist().addTags("a", "b");
        assertNotNull(safelist);
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist().removeTags("a", "b");
        assertNotNull(safelist);
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist().addAttributes("a", "b");
        assertNotNull(safelist);
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist().removeAttributes("a", "b");
        assertNotNull(safelist);
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist().addEnforcedAttribute("a", "b", "c");
        assertNotNull(safelist);
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist().removeEnforcedAttribute("a", "b");
        assertNotNull(safelist);
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist().preserveRelativeLinks(true);
        assertNotNull(safelist);
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist().addProtocols("a", "b", "c");
        assertNotNull(safelist);
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist().removeProtocols("a", "b");
        assertNotNull(safelist);
    }

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist().addTags("a");
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist().addAttributes("p", "class");
        Element el = Mockito.mock(Element.class);
        Attribute attr = Mockito.mock(Attribute.class);
        Mockito.when(attr.getKey()).thenReturn("class");

        assertTrue(safelist.isSafeAttribute("p", el, attr));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist().addEnforcedAttribute("p", "class", "testClass");
        Attributes attrs = safelist.getEnforcedAttributes("p");
        assertEquals("testClass", attrs.get("class"));
    }

}