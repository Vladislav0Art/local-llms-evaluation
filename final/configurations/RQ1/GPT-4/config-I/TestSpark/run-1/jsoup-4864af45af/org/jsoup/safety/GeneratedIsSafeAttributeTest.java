package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = Safelist.relaxed();

        Element el = new Element("img");
        el.attr("src", "http://test.com");
        el.attr("width", "100");

        assertTrue(safelist.isSafeAttribute("img", el, el.attributes().asList().get(0)));
        assertTrue(safelist.isSafeAttribute("img", el, el.attributes().asList().get(1)));
    }

}