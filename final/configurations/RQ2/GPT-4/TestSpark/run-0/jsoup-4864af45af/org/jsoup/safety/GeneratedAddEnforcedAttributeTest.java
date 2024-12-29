package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedAddEnforcedAttributeTest {

    //Testing null variables during instantiation

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.addEnforcedAttribute("a", "rel", "nofollow");
        assertNotNull(safelist);
    }

}