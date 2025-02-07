package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedRemoveAttributes {

    @Test
    public void removeAttributes() {
        Safelist safelist = new Safelist();
        safelist.removeAttributes("img", "style");
        Element element = new Element("img");
        ((Safelist) element).addTags("src", "https://example.com");
        assertTrue(element.getAttribute("src").startsWith("https://example.com"));
    }

}