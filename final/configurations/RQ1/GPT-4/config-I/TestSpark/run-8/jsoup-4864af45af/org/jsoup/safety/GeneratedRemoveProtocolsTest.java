package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addProtocols("a", "href", "http");
        safelist.removeProtocols("a", "href", "http");
        Attributes attrs = new Attributes();
        assertFalse(safelist.isSafeAttribute("a", null, attrs.newAttribute("href", "http://example.com")));
    }

}