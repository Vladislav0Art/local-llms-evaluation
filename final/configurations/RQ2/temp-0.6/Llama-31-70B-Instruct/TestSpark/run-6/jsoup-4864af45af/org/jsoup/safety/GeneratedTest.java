package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.isSafeTag("HTML"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Element element = new Element("HTML");
        Attribute attribute = new Attribute("src", "https://www.google.com");
        assertTrue(safelist.isSafeAttribute("HTML", element, attribute));

        Attribute attribute2 = new Attribute("src", "javascript:alert('XSS')");
        assertFalse(safelist.isSafeAttribute("HTML", element, attribute2));
    }

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        assertNotNull(safelist.getEnforcedAttributes("HTML"));
    }

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.addTags("HTML").size());
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.removeTags("HTML").size());
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.addAttributes("HTML", "src").size());
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        assertEquals(0, safelist.removeAttributes("HTML", "src").size());
    }

}