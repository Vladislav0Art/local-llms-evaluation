package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div");
        safelist.addEnforcedAttribute("div", "style", "width:100px");
        assertTrue(safelist.getEnforcedAttributes("div").hasKey("style"));
    }

}