package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "src", "/image.jpg")
                .removeEnforcedAttribute("img");
        assertEquals(0, safelist.getEnforcedAttributes("img").size());
    }

}