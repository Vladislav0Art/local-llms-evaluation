package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedBasicWithImagesAndLinks {

    @Test
    public void basicWithImagesAndLinks() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basicWithImages().isSafeTag("img"));
        assertTrue(safelist.basicWithImages().isSafeTag("a"));
        assertFalse(safelist.basicWithImages().isSafeTag("text"));
    }

}