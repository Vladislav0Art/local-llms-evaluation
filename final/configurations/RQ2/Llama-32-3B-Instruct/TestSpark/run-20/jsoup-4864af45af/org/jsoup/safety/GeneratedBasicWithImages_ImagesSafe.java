package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedBasicWithImages_ImagesSafe {

    @Test
    public void basicWithImages_ImagesSafe() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertTrue(basicWithImages.isSafeAttribute("img", null, null));
    }

}