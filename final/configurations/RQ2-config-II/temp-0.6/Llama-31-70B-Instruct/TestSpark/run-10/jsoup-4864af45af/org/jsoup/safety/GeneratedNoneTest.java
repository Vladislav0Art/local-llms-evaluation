package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        // Given
        Safelist safelist = Safelist.none();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

}