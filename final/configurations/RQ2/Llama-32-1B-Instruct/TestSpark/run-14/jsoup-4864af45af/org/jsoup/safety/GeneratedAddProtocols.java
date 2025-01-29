package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedAddProtocols {

    @Test
    public void addProtocols() {
        Safelist safelist = Safelist.basicWithImages();
        safelist.addProtocols("a", "href", "#top");
        String protocol = "href";
        String value = "top";
        safelist.addProtocols(protocol, value);
        assertNotNull(safelist.getEnforcedAttributes(protocol));
    }

}