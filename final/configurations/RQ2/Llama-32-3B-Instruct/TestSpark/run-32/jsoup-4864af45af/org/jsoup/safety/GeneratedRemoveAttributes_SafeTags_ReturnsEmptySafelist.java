package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveAttributes_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void removeAttributes_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.removeAttributes();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("br"));
    }

}