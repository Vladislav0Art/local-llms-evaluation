package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRelaxed_WithProtocols_SafeTagsTest {

    @Test
    public void relaxed_WithProtocols_SafeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("img"));
    }

}