package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveTags_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void removeTags_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.removeTags();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("b"));
    }

}