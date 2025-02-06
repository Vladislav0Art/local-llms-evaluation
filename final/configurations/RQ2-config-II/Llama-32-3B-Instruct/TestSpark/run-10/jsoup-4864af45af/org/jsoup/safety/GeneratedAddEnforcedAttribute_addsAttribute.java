package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedAddEnforcedAttribute_addsAttribute {

    @Test
    public void addEnforcedAttribute_addsAttribute() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        assertTrue(s.addEnforcedAttribute(tag, attribute, value));
        assertFalse(s.removeEnforcedAttribute(tag, attribute));
    }

}