package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeTagSafeTest {

    @Mock
    Safelist safelist;

    @Test
    public void isSafeTagSafeTest() {
        boolean result = safelist.isSafeTag("div");
        assertTrue(result);
    }

}