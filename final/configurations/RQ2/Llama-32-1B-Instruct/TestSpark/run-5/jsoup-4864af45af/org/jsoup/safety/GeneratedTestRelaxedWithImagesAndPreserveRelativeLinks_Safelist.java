package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRelaxedWithImagesAndPreserveRelativeLinks_Safelist {

    @Test
    public void testRelaxedWithImagesAndPreserveRelativeLinks_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertTrue(safelist.isSafeProtocol("script", "type", "text/javascript"));
    }

}