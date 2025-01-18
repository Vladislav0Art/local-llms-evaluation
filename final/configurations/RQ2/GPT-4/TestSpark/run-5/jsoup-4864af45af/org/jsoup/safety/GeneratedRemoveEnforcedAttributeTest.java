package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("tag", "attr", "value");
        safelist.removeEnforcedAttribute("tag", "attr");
        assertFalse(safelist.getEnforcedAttributes("tag").hasKey("attr"));
    }

}