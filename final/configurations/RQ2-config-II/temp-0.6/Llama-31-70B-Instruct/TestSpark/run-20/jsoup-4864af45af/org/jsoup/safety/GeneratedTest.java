package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getTags().isEmpty());
        assertTrue(safelist.getAttributes().isEmpty());
        assertTrue(safelist.getEnforcedAttributes().isEmpty());
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.getProtocols().isEmpty());
        assertEquals(2, safelist.getTags().size());
        assertTrue(safelist.getTags().contains("p"));
        assertTrue(safelist.getTags().contains("br"));
        assertTrue(safelist.getAttributes().isEmpty());
        assertTrue(safelist.getEnforcedAttributes().isEmpty());
        assertTrue(safelist.isSafeTag("p"));
    }

}