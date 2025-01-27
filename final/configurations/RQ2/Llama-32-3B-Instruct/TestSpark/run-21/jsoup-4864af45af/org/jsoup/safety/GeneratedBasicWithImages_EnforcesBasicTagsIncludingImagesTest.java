package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasicWithImages_EnforcesBasicTagsIncludingImagesTest {

    @Test
    public void basicWithImages_EnforcesBasicTagsIncludingImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
    }

}