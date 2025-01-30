package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols("a", "href", "http");

        Element el = Jsoup.parse("<a href='http://test-url'></a>");
        assertFalse(safelist.isSafeAttribute("a", el, el.attributes().iterator().next()));
    }

}