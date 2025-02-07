package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedRemoveProtocols {

    @Test
    public void removeProtocols() {
        Safelist safelist = new Safelist();
        safelist.removeProtocols("a", "href", "https://example.com");
        Element element = new Element("a");
        ((Safelist) element).addTags("href", "https://example2.com");
        assertTrue(element.getAttribute("href").startsWith("https://example2.com"));
    }

}