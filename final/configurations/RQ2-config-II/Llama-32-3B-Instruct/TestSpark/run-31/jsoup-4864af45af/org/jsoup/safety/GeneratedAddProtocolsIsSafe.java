package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedAddProtocolsIsSafe {

    @Test
    public void addProtocolsIsSafe() {
        Safelist safelist = Safelist.basic();
        safelist.addProtocols("img", "src", "https://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("src", "https://example.com")));
    }

}