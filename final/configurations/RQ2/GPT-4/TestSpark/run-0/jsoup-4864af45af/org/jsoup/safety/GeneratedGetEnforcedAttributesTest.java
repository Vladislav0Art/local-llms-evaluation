package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedGetEnforcedAttributesTest {

    //Testing null variables during instantiation

    @Test
    public void getEnforcedAttributesTest() {
        Safelist safelist = Safelist.basic();
        Attributes attributes = safelist.getEnforcedAttributes("img");
        assertNotNull(attributes);
    }

}