package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_NoProtocolsTest {

    @Test
    public void basic_NoProtocolsTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("", null, null));
        assertFalse(safelist.isSafeAttribute("img", null, null));
    }

}