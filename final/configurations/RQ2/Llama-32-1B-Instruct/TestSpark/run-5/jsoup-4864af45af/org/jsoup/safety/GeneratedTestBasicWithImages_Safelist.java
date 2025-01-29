package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBasicWithImages_Safelist {

    @Test
    public void testBasicWithImages_Safelist() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

}