package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBasic_Safelist {

    @Test
    public void testBasic_Safelist() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

}