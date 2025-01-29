package org.jsoup.safety;

import org.junit.jupiter.api.Test;
import org.jsoup.safety.Safelist;
import org.mockito.Mockito;

public class GeneratedNoneCopyTest {

    @Test
    public void noneCopyTest() {
        Safelist noneCopy = new Safelist().none().copy();
        Mockito.when(noneCopy.isSafeTag("a")).thenReturn(true);
        boolean result = noneCopy.none().isSafeTag("a");
        assertTrue(result);
    }

}