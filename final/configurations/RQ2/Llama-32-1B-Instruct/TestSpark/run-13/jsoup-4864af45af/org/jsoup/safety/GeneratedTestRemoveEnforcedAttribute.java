package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestRemoveEnforcedAttribute {

    @Test
    public void testRemoveEnforcedAttribute() {
        Safelist safelist = Safelist.removeEnforcedAttribute("a", "href");
        assertTrue(!safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeAttribute("a", "", ""));
    }

}