package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedNone_SafeTagsTest {

    @Test
    public void none_SafeTagsTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

}