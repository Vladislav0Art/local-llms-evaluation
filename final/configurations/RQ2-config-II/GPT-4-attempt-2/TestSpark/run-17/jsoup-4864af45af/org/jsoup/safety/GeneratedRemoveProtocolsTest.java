package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols("a", "href", "http");
        assertFalse(safelist.isSafeAttribute("a", new Element("a").attr("href", "http://example.com"), new Attribute("href", "http://example.com")));
    }

}