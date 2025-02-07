package org.jsoup.safety;

import org.jsoup.Safelist;
import org.junit.jupiter.api.Test;

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.getEnforcedAttributes("img").size() > 0);
        assertTrue(!safelist.getEnforcedAttributes("a").isEmpty());
    }

}