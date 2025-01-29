package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist basic = Safelist.basic();
        assertFalse(basic.isSafeTag(""));
        assertFalse(basic.isSafeAttribute("", ""));
        assertTrue(basic.isSafeAttribute("test", "value1", "attribute2=value2"));
    }

}