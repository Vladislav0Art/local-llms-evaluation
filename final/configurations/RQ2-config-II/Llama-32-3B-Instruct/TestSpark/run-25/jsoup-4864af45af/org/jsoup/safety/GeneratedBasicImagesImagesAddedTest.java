package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedBasicImagesImagesAddedTest {

    @Test
    public void basicImagesImagesAddedTest() {
        Safelist safelist = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img");
        assertTrue(safelist.addTags(expectedTags).isSafeTag("img"));
    }

}