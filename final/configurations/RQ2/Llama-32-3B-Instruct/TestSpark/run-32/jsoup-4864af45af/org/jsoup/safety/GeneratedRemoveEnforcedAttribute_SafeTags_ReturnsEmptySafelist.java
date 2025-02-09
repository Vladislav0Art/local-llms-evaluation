package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveEnforcedAttribute_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void removeEnforcedAttribute_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.removeEnforcedAttribute();
        assertTrue(saflist.isSafeTag("a"));
        assertTrue(saflist.isSafeTag("img"));
        assertTrue(saflist.isSafeTag("br"));
    }

}