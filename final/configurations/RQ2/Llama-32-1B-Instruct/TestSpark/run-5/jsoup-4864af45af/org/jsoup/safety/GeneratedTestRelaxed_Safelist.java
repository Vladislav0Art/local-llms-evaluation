package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRelaxed_Safelist {

    @Test
    public void testRelaxed_Safelist() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeAttribute("script", "src", "/image.jpg"));
    }

}