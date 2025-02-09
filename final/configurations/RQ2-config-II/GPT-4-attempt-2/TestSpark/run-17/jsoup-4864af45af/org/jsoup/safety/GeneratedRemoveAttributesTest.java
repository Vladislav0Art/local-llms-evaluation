package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        Element el = new Element("div");
        el.attr("style", "color: red");
        safelist.removeAttributes("div", "style");
        assertFalse(safelist.isSafeAttribute("div", el, new Attribute("style", "color: red")));
    }

}