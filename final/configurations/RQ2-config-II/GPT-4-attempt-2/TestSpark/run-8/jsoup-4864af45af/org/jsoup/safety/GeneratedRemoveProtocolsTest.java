package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addProtocols("a", "href", "ftp");
        Element el = new Element("a");
        el.attr("href", "ftp://example.com");

        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
        safelist.removeProtocols("a", "href", "ftp");
        assertFalse(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
    }

}