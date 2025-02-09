package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        String tag = "img";
        String attr = "alt";
        safelist.addEnforcedAttribute(tag, attr, "alternate text");
        safelist.removeEnforcedAttribute(tag, attr);
        Attributes attrs = safelist.getEnforcedAttributes(tag);
        assertFalse(attrs.hasKey(attr));
    }

}