package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basicWithImages().isSafeTag("img"));
        assertFalse(safelist.basicWithImages().isSafeTag("text"));
    }

}