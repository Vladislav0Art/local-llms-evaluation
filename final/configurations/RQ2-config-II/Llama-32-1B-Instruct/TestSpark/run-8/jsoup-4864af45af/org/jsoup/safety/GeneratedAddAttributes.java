package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedAddAttributes {

    @Test
    public void addAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "class", "active");
        Element element = new Element("a");
        ((Safelist) element).addTags("href", "https://example.com");
        assertTrue(element.getAttribute("class").contains("active"));
    }

}