package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist relaxed = Safelist.relaxed();
        assertFalse(relaxed.isSafeTag(""));
        assertFalse(relaxed.isSafeAttribute("", ""));
        assertTrue(relaxed.isSafeAttribute("test", "value1", "attribute2=value2"));
    }

}