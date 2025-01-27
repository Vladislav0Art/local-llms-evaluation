package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedRemoveAttributes {

    @Test
    public void removeAttributes() {
        Safelist safelist = Safelist.addAttributes("div", "style")
                .addAttributes("div", "color");
        assertEquals(2, safelist.getEnforcedAttributes("div").size());
    }

}