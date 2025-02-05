package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist().addTags("tag").addEnforcedAttribute("tag", "attr", "value");
        Attributes attrs = safelist.getEnforcedAttributes("tag");
        assertEquals("value", attrs.get("attr"));
    }

}