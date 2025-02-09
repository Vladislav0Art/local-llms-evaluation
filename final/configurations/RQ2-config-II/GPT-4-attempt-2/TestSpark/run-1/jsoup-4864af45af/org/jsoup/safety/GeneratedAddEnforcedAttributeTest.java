package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("p", "style", "color: red;");
        Attributes attributes = safelist.getEnforcedAttributes("p");
        assertEquals("color: red;", attributes.get("style"));
    }

}