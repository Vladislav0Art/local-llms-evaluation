package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedBasicWithImages_SafelistContainsBasicTagsAndAttributesPlusImages {

    @Test
    public void basicWithImages_SafelistContainsBasicTagsAndAttributesPlusImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

}