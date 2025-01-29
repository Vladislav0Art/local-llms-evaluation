package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedBasicTextWithImagesTest {

    @Test
    public void basicTextWithImagesTest() {
        Safelist basicText = new Safelist().basicWithImages().basicText();
        Mockito.when(basicText.isSafeTag("img")).thenReturn(true);
        boolean result = basicText.basicTextWithImages().simpleText();
        assertTrue(result);
    }

}