package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSafeAttribute_SafeTagUnsafeAttribute {

    @Mock
    private Element element;

    @Test
    public void isSafeAttribute_SafeTagUnsafeAttribute() {
        when(element.getName()).thenReturn("h1");
        assertFalse(Safelist.isSafeAttribute("h1", element, new Attribute()));
    }

}