package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedIsSafeTag_ReturnsTrueForSafeTags {

    @Test
    public void isSafeTag_ReturnsTrueForSafeTags() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("script"));
    }

}