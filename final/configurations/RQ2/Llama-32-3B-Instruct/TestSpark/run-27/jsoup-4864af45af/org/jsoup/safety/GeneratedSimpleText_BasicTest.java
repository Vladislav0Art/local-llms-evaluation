package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSimpleText_BasicTest {

    @Test
    public void simpleText_BasicTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

}