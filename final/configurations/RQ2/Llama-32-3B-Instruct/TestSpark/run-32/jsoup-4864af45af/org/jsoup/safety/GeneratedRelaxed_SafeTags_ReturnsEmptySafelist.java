package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRelaxed_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void relaxed_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("br"));
        assertTrue(safelist.isSafeTag("b"));
    }

}