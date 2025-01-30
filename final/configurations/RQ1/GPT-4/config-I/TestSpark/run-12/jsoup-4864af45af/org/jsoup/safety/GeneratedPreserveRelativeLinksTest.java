package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(true);

        Element el = Jsoup.parse("<a href='/test-url'></a>");
        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().iterator().next()));
    }

}