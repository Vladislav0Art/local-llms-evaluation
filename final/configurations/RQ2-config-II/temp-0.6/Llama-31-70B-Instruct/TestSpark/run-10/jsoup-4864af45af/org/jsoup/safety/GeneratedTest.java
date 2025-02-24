package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void noneTest() {
        // Given
        Safelist safelist = Safelist.none();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

    @Test
    public void simpleTextTest() {
        // Given
        Safelist safelist = Safelist.simpleText();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

    @Test
    public void basicTest() {
        // Given
        Safelist safelist = Safelist.basic();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

    @Test
    public void basicWithImagesTest() {
        // Given
        Safelist safelist = Safelist.basicWithImages();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

    @Test
    public void relaxedTest() {
        // Given
        Safelist safelist = Safelist.relaxed();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

}