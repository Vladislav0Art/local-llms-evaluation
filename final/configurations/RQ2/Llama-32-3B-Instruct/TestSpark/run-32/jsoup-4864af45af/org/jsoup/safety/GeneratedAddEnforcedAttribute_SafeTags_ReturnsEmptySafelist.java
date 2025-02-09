package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddEnforcedAttribute_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void addEnforcedAttribute_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.addEnforcedAttribute();
        assertTrue(saflist.isSafeTag("a"));
        assertTrue(saflist.isSafeTag("img"));
        assertFalse(saflist.isSafeTag("br"));
    }

}