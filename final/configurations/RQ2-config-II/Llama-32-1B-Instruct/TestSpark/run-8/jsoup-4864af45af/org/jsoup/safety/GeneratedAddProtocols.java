package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedAddProtocols {

    @Test
    public void addProtocols() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "https://example.com");
        Element element = new Element("a");
        ((Safelist) element).addTags("href", "https://example.com");
        assertTrue(element.getAttribute("href").startsWith("https://example.com"));
    }

}