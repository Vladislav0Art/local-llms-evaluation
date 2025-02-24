package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getTags().isEmpty());
        assertTrue(safelist.getAttributes().isEmpty());
        assertTrue(safelist.getEnforcedAttributes().isEmpty());
        assertFalse(safelist.isSafeTag("div"));
    }

}