package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(true);

        Element el = new Element("a");
        el.attr("href", "/test");

        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
    }

}