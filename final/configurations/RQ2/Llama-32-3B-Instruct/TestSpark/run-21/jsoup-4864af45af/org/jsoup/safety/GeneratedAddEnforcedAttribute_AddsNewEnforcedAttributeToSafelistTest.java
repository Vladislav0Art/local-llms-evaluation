package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddEnforcedAttribute_AddsNewEnforcedAttributeToSafelistTest {

    @Test
    public void addEnforcedAttribute_AddsNewEnforcedAttributeToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.addEnforcedAttribute("img", "data-src", "example.com");
        assertEquals(1, ((Attribute) new Attributes().add("data-src")).getIntValue());
    }

}