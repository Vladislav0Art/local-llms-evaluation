package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("a", "target", "_blank");

        Element el = new Element("a");
        el.attr("target", "_blank");

        // The attribute is added and it should be safe
        assertTrue(safelist.isSafeAttribute("a", el, el.attributes().asList().get(0)));
    }

}