package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedRemoveAttributes_removesAttributes {

    @Test
    public void removeAttributes_removesAttributes() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        s.addAttributes(tag, attribute, value);
        assertTrue(s.removeAttributes(tag, attribute));
        assertFalse(s.removeAttributes(tag, attribute));
    }

}