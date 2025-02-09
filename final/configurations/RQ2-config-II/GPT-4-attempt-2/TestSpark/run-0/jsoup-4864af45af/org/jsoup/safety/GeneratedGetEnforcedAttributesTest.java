package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetEnforcedAttributesTest {

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attribute", "value");
        Attributes result = safelist.getEnforcedAttributes("tag");
        assertNotNull(result);
    }

}