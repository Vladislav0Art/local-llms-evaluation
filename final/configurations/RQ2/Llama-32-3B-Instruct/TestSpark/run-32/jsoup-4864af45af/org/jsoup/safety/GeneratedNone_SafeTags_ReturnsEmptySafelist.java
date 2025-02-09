package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNone_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void none_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("b"));
    }

}