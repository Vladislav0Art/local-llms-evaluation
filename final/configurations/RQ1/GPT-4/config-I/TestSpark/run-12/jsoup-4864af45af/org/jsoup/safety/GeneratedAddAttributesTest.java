package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addAttributes("div", "test-attr");

        Element el = Jsoup.parse("<div test-attr='test'></div>");
        assertTrue(safelist.isSafeAttribute("div", el, el.attributes().iterator().next()));
    }

}