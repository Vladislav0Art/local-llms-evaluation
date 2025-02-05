package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist().addEnforcedAttribute("p", "class", "testClass");
        Attributes attrs = safelist.getEnforcedAttributes("p");
        assertEquals("testClass", attrs.get("class"));
    }

}