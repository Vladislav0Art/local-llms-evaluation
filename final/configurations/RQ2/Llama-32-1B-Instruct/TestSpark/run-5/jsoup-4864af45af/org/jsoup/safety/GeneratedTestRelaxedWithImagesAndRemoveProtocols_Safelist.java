package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRelaxedWithImagesAndRemoveProtocols_Safelist {

    @Test
    public void testRelaxedWithImagesAndRemoveProtocols_Safelist() {
        Safelist safelist = Safelist.relaxedWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", "src", "/image.jpg"));
        assertTrue(safelist.isSafeProtocol("script", "type", "text/javascript"));
        String[] removeProtocols = new String[]{"type"};
        safelist.removeProtocols(removeProtocols);
        assertTrue(!safelist.isSafeTag("script"));
    }

}