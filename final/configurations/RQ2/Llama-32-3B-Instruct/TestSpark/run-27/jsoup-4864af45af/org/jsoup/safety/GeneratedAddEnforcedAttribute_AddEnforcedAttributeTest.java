package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddEnforcedAttribute_AddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttribute_AddEnforcedAttributeTest() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "text");
        assertTrue(safelist.getEnforcedAttributes("img").contains(new Attribute("alt", "text")));
    }

}