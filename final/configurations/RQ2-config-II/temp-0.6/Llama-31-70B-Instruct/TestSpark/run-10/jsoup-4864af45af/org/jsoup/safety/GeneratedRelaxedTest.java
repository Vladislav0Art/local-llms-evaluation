package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

public class GeneratedRelaxedTest {

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