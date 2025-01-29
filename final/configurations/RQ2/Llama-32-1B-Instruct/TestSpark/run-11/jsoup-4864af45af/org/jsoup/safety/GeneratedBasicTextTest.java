package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedBasicTextTest {

    @Test
    public void basicTextTest() {
        Safelist basicText = new Safelist().basic().simpleText();
        Mockito.when(basicText.isSafeTag("text")).thenReturn(false);
        boolean result = basicText.basicText().simpleText();
        assertTrue(result);
    }

}