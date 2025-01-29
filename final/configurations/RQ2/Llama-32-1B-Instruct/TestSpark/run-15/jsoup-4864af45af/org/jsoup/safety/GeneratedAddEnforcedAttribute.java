package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist.Safelist.EnforceEnforcedAttribute s = Safelist.addEnforcedAttribute("href", "https://www.example.com", "title");
        assertEquals(true, s.isSafe());
        s.preserveRelativeLinks(false);
        assertTrue(Safelist.isSafeTag("a"));
    }

}