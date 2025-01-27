package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "src", "/image.jpg");
        assertEquals("/image.jpg", safelist.getEnforcedAttributes("img").get(0));
    }

}