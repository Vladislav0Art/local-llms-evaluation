package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Safelist safelist;

    @Test
    public void isSafeTagSafeTest() {
        boolean result = safelist.isSafeTag("div");
        assertTrue(result);
    }

    @Test
    public void isSafeAttributeSafeTest() {
        boolean result = safelist.isSafeAttribute("div", null, null);
        assertTrue(result);
    }

    @Test
    public void getEnforcedAttributesSafeTest() {
        Attributes attributes = safelist.getEnforcedAttributes("div");
        assertNotNull(attributes);
    }

}