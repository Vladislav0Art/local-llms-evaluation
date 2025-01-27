package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNone_SafelistTest {

    @Test
    public void none_SafelistTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("script"));
    }

}