package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void RemoveProtocolsTest() throws Exception {
        Safelist safelist = Safelist.none();
        safelist.addTags("a").addAttributes("a", "href");
        safelist.addProtocols("a", "href", "http", "https", "ftp");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://example.com")));
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "http://example.com")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://example.com")));
    }

}