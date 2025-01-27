package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Test;

public class GeneratedSimpleText_NoAttributes_addEnforcedAttribute {

    @Test
    public void simpleText_NoAttributes_addEnforcedAttribute() {
        Safelist safeList = Safelist.simpleText();
        safeList.addEnforcedAttribute("a", "href", "");
        assertEquals(new HashSet<>(Arrays.asList("img", "br", "p")), safeList.getEnforcedAttributes("body"));
    }

}