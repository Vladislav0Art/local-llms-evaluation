package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = Safelist.addEnforcedAttribute("input", "type", "checkbox");
        assertEquals("checkbox", safelist.getEnforcedAttributes("input").get(0).value());
    }

}