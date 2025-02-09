package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "https", "ftp");
        safelist.removeProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href", "https://secure-url")));
        assertFalse(safelist.isSafeAttribute("a", null, new Attribute("href", "ftp://old-url")));
    }

}