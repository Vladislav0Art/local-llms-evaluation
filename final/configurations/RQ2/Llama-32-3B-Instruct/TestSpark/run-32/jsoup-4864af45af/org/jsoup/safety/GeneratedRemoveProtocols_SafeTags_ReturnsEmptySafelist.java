package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveProtocols_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void removeProtocols_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.removeProtocols();
        assertTrue(saflist.isSafeTag("a"));
        assertTrue(saflist.isSafeTag("img"));
        assertTrue(saflist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("b"));
    }

}