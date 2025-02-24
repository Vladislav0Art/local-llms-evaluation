package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        // Given
        Safelist safelist = Safelist.simpleText();

        // When
        boolean isSafeTag = safelist.isSafeTag("div");

        // Then
        assertFalse(isSafeTag);
    }

}