package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeAttribute_ReturnsTrueWhenAllAttributesAreSafe {

    @Mock
    private String tag;

    @Test
    public void isSafeAttribute_ReturnsTrueWhenAllAttributesAreSafe() {
        Safelist safelist = Safelist.none();
        Element element = new Element("div");
        Attribute attribute = new Attribute("class", "safe-class");
        when(Safelist.isSafeAttribute(tag, element, attribute)).thenReturn(true);
        assertTrue(Safelist.basic().isSafeAttribute(tag, element, attribute));
    }

}