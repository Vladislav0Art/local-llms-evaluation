package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTestEnforcedAttributes {

    @Test
    public void testEnforcedAttributes() {
        Safelist safelist = Safelist.enforceAttributes();
        assertTrue(safelist.getEnforcedAttributes("a"));
        assertTrue(safelist.getEnforcedAttributes("img"));
    }

}