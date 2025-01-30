package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("div", "class", "test");
        safelist.removeEnforcedAttribute("div", "class");
        Attributes attributes = safelist.getEnforcedAttributes("div");
        assertFalse(attributes.hasKey("class"));
    }

}