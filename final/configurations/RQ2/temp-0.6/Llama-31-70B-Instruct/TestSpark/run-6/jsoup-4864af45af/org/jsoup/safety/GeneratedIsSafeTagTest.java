package org.jsoup.safety;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.isSafeTag("HTML"));
        assertFalse(safelist.isSafeTag("script"));
    }

}