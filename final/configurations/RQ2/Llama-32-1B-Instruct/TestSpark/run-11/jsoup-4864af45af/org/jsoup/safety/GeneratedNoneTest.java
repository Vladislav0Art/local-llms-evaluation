package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist none = new Safelist();
        Mockito.when(none.isSafeTag("a")).thenReturn(false);
        boolean result = none.none();
        assertTrue(result);
    }

}