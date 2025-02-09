package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        String tagName = "a";
        Attributes result = new Safelist().getEnforcedAttributes(tagName);
        assertNotNull(result);
    }

}