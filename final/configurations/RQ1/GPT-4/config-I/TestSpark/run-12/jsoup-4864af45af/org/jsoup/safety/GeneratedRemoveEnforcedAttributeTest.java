package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.addEnforcedAttribute("div", "test-attr", "test");
        safelist.removeEnforcedAttribute("div", "test-attr");

        Element el = Jsoup.parse("<div test-attr='test'></div>");
        assertFalse(safelist.isSafeAttribute("div", el, el.attributes().iterator().next()));
    }

}