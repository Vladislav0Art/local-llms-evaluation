package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRelaxedWithImagesAndRemoveEnforcedAttributes_Safelist {

    @Test
    public void testRelaxedWithImagesAndRemoveEnforcedAttributes_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.getEnforcedAttributes("text").contains("type"));
        assertTrue(safelist.isSafeTag("img"));
        String[] removeAttributes = new String[]{"src"};
        safelist.removeAttributes(removeAttributes);
        assertFalse(safelist.getEnforcedAttributes("script"));
    }

}