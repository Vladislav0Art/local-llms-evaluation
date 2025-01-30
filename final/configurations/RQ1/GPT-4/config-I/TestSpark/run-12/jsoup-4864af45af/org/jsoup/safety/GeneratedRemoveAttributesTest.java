package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("div", "id");

        Element el = Jsoup.parse("<div id='test-id'></div>");
        assertFalse(safelist.isSafeAttribute("div", el, el.attributes().iterator().next()));
    }

}