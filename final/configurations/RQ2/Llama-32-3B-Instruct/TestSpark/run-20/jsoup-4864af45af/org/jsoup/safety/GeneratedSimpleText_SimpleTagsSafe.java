package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSimpleText_SimpleTagsSafe {

    @Test
    public void simpleText_SimpleTagsSafe() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("iframe"));
    }

}