package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Element element = new Element("HTML");
        Attribute attribute = new Attribute("src", "https://www.google.com");
        assertTrue(safelist.isSafeAttribute("HTML", element, attribute));

        Attribute attribute2 = new Attribute("src", "javascript:alert('XSS')");
        assertFalse(safelist.isSafeAttribute("HTML", element, attribute2));
    }

}