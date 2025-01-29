package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRelaxedWithImages_Safelist {

    @Test
    public void testRelaxedWithImages_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

}