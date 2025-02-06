package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedRelaxed_SafelistContainsRelaxedTags {

    @Test
    public void relaxed_SafelistContainsRelaxedTags() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("script"));
    }

}