package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedBasic_SafelistContainsBasicTags {

    @Test
    public void basic_SafelistContainsBasicTags() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("img"));
    }

}