package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestSimpleText_Safelist {

    @Test
    public void testSimpleText_Safelist() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

}