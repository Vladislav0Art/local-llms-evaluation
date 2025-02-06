package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddAttributes {

    @Test
    public void addAttributes() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image", "width", "300");
        assertEquals("alt image 300", safelist.getEnforcedAttributes("img").get(0).value());
    }

}