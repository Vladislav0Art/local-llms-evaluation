package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist.Safelist.EnforceEnforcedAttribute s = Safelist.addEnforcedAttribute("href", "https://www.example.com", "title");
        s.removeEnforcedAttribute();
        assertFalse(Safelist.isSafeTag("a"));
    }

}