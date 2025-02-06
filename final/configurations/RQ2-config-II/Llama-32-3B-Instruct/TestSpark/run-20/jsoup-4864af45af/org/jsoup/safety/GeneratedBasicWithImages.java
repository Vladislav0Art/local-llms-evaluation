package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Safelist result = Safelist.basic().addTags("img", "script");
        assertTrue(Safelist.BASIC_WITH_IMAGES.equals(result));
    }

}