package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeAttributeSafeTest {

    @Mock
    Safelist safelist;

    @Test
    public void isSafeAttributeSafeTest() {
        boolean result = safelist.isSafeAttribute("div", null, null);
        assertTrue(result);
    }

}