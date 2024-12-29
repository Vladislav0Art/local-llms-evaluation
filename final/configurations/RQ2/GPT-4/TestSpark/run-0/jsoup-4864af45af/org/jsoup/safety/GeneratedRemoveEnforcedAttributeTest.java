package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveEnforcedAttributeTest {

    //Testing null variables during instantiation

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.removeEnforcedAttribute("img", "alt");
        assertNotNull(safelist);
    }

}