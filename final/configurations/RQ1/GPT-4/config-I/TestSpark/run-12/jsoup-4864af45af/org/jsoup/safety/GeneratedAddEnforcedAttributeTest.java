package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addEnforcedAttribute("div", "test-attr", "test");

        Element el = Jsoup.parse("<div test-attr='test'></div>");
        assertTrue(safelist.isSafeAttribute("div", el, el.attributes().iterator().next()));
    }

}