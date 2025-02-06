package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_WithProtocols_SafeTagsTest {

    @Test
    public void basic_WithProtocols_SafeTagsTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("img"));
    }

}