package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "http");

        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://example.com")));
    }

}