package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();

        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        assertEquals("nofollow", safelist.getEnforcedAttributes("a").get("rel"));
    }

}