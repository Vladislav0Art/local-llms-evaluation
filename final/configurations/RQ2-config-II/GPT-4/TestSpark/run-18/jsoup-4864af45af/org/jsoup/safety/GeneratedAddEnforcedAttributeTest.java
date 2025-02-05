package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        final Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "target", "_blank");
        assertNotNull(safelist.getEnforcedAttributes("a"));
    }

}