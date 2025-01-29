package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedRelaxedTextTest {

    @Test
    public void relaxedTextTest() {
        Safelist relaxedText = new Safelist().relaxed().simpleText();
        Mockito.when(relaxedText.isSafeTag("a")).thenReturn(false);
        boolean result = relaxedText.relaxedText().simpleText();
        assertTrue(result);
    }

}