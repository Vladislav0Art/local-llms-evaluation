package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedBasicWithImagesNotSafe {

    @Test
    public void basicWithImagesNotSafe() {
        Safelist safelist = Safelist.basic();
        assertFalse(safelist.isSafeTag("img"));
    }

}