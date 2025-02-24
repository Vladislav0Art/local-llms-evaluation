package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedGetEnforcedAttributesTest {

    private Safelist safelist = new Safelist();

    @Test
    public void getEnforcedAttributesTest() {
        assertNotNull(safelist.getEnforcedAttributes("div"));
    }

}