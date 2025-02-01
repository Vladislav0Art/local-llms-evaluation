package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div");
        safelist.addEnforcedAttribute("div", "style", "width:100px");
        Element element = new Element("div");
        Attribute style = new Attribute("style", "width:100px");
        assertTrue(safelist.isSafeAttribute("div", element, style));
        safelist.removeEnforcedAttribute("div", "style");
        assertFalse(safelist.isSafeAttribute("div", element, style));
    }

}