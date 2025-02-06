package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedRemoveEnforcedAttribute_removesAttribute {

    @Test
    public void removeEnforcedAttribute_removesAttribute() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        s.addEnforcedAttribute(tag, attribute, value);
        assertTrue(s.removeEnforcedAttribute(tag, attribute));
        assertFalse(s.removeEnforcedAttribute(tag, attribute));
    }

}