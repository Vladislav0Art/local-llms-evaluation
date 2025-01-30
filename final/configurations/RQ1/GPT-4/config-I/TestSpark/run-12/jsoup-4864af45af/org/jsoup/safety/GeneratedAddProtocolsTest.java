package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addProtocols("a", "href", "test");

        Element el = Jsoup.parse("<a href='test://test-url'></a>");
        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().iterator().next()));
    }

}