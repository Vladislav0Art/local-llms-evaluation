package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "https");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://example.com")));
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
    }

}