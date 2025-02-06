package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedAddAttributes_addsAttributes {

    @Test
    public void addAttributes_addsAttributes() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        assertTrue(s.addAttributes(tag, attribute, value));
        assertFalse(s.removeAttributes(tag, attribute));
    }

}