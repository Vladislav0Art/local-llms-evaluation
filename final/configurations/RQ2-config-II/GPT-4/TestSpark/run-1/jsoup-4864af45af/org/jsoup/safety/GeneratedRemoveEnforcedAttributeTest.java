package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist().addTags("tag").addEnforcedAttribute("tag", "attr", "value");
        safelist.removeEnforcedAttribute("tag", "attr");
        Attributes attrs = safelist.getEnforcedAttributes("tag");
        assertFalse(attrs.hasKey("attr"));
    }

}