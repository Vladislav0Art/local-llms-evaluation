package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedAddAttributes {

    @Test
    public void addAttributes() {
        Safelist safelist = Safelist.addAttributes("div", "style");
        assertEquals(1, safelist.getEnforcedAttributes("div").size());
    }

}