package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedBasicWithImages_SimpleTags_ReturnsBasicWithImages {

    @Test
    public void basicWithImages_SimpleTags_ReturnsBasicWithImages() {
        Safelist result = Safelist.basicWithImages();
        assertTrue(result.getSafeTags().contains("img"));
        assertTrue(result.getSafeTags().contains("br"));
    }

}