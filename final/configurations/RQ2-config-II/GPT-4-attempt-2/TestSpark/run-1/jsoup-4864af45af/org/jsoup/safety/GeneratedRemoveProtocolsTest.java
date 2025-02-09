package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
    }

}