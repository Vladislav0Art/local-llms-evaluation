package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("p", "style", "color: red;");

        Attributes attrs = safelist.getEnforcedAttributes("p");

        assertTrue(attrs.hasKey("style"));
        assertEquals(attrs.get("style"), "color: red;");
    }

}