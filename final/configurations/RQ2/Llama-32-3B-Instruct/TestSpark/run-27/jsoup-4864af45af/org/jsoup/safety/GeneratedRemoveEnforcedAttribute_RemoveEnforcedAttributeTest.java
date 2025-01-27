package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveEnforcedAttribute_RemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttribute_RemoveEnforcedAttributeTest() {
        Safelist safelist = Safelist.removeEnforcedAttribute("img", "alt");
        assertEquals(null, safelist.getEnforcedAttributes("img"));
    }

}