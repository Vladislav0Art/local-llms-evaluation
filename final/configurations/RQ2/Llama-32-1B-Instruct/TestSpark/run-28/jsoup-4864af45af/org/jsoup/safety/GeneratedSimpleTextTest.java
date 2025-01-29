package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist simpleText = Safelist.simpleText();
        assertFalse(simpleText.isSafeTag("test"));
        assertTrue(simpleText.isSafeAttribute("test", "value", "attribute1=value1"));
        assertFalse(simpleText.isSafeAttribute("test", "", ""));
    }

}