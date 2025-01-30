package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "class", "id");

        Element el = new Element("a");
        el.attr("class", "link");
        el.attr("id", "link_id");

        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().asList().get(1)));
    }

}