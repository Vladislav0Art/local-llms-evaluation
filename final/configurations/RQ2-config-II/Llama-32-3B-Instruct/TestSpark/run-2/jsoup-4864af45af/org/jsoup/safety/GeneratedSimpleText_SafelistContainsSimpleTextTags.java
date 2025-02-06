package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedSimpleText_SafelistContainsSimpleTextTags {

    @Test
    public void simpleText_SafelistContainsSimpleTextTags() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("script"));
    }

}