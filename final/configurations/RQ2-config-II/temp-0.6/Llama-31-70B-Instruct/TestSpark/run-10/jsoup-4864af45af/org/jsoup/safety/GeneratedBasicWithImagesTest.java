package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        // Given
        Safelist safelist = Safelist.basicWithImages();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

}