package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;

public class GeneratedAddProtocols {

    @Test
    public void addProtocols() {
        Safelist safelist = Safelist.addProtocols("img", "src");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

}