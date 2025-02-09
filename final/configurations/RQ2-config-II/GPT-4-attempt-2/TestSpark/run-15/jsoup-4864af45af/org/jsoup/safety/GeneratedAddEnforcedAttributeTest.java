package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "img";
        String attr = "alt";
        safelist.addEnforcedAttribute(tag, attr, "alternate text");
        Attributes attrs = safelist.getEnforcedAttributes(tag);
        assertTrue(attrs.hasKey(attr));
    }

}