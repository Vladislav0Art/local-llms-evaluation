package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class GeneratedBasicWithImagesAndProtocols {

    @Test
    public void basicWithImagesAndProtocols() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.basicWithImages(true).isSafeTag("img"));
        assertTrue(safelist.basicWithImages(true).isSafeTag("a"));
        assertFalse(safelist.basicWithImages(true).isSafeTag("text"));
    }

}