package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestRemoveEnforcedAttribute {

    @Test
    public void testRemoveEnforcedAttribute() {
        Safelist safelist = new Safelist().relaxed();
        safelist.removeEnforcedAttribute("a");
        assertFalse(Safelist.relaxed().isSafeAttribute("a", "href", "/about.html"));
    }

}