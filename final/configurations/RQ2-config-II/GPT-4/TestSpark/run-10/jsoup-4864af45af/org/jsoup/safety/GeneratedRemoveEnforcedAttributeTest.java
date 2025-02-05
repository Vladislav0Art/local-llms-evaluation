package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("div", "id", "value");
        safelist.removeEnforcedAttribute("div", "id");

        Attributes attributes = safelist.getEnforcedAttributes("div");
        assertFalse(attributes.hasKey("id"));
    }

}