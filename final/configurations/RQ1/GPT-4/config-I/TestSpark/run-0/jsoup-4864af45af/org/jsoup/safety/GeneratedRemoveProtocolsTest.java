package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");
        Element a = new Element("a");
        a.attr("href", "http://example.com");
        assertFalse(safelist.isSafeAttribute("a", a, a.attributes().asList().get(0)));
    }

}