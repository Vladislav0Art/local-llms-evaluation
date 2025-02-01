package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProtocolsTest {

    @Test
    public void AddProtocolsTest() throws Exception {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addAttributes("a", "href");
        safelist.addProtocols("a", "href", "http", "https");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://example.com")));
    }

}