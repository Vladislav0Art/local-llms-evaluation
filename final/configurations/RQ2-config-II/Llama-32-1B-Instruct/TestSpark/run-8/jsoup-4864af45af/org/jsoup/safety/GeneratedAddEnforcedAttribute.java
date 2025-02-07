package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "href", "https://example.com");
        Element element = new Element("a");
        assertTrue(element.getAttribute("href").startsWith("https://example.com"));
    }

}