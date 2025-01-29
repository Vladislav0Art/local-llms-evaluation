package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist simpleText = new Safelist().simpleText();
        Mockito.when(simpleText.isSafeTag("text")).thenReturn(true);
        boolean result = simpleText.simpleText();
        assertTrue(result);
    }

}