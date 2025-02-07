package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        Element element = new Element("a");
        ((Safelist) element).addTags("href", "https://example.com");
        assertTrue(element.getAttribute("href").startsWith("https://example.com"));
    }

}