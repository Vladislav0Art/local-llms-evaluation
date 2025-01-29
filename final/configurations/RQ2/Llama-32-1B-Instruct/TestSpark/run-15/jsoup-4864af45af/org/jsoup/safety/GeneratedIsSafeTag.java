package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeTag {

    @Test
    public void isSafeTag() {
        assertTrue(Safelist.isSafeTag("a"));
        assertFalse(Safelist.isSafeTag("img"));
    }

}