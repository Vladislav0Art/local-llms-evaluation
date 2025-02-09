package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetEnforcedAttributes_SafeTags_ReturnsEmptySafelist {

    @Mock
    private Element element;

    @Test
    public void getEnforcedAttributes_SafeTags_ReturnsEmptySafelist() {
        Safelist safelist = Safelist.getEnforcedAttributes();
        assertEquals(new Attributes(), safelist.getEnforcedAttributes("a"));
    }

}