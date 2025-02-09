package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("p", "style");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertTrue(attributes.hasKey("style"));
    }

}