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
public class GeneratedIsSafeAttribute_SafeTagSafeAttribute {

    @Mock
    private Element element;

    @Test
    public void isSafeAttribute_SafeTagSafeAttribute() {
        when(element.getName()).thenReturn("img");
        assertTrue(Safelist.isSafeAttribute("img", element, new Attribute()));
    }

}