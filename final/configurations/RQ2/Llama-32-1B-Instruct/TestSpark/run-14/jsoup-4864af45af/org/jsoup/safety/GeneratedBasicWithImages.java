package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
        assertTrue(safelist.isSafeTag("img"));
    }

}