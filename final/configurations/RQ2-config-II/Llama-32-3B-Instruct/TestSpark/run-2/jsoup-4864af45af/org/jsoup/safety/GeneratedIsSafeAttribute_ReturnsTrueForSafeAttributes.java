package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedIsSafeAttribute_ReturnsTrueForSafeAttributes {

    @Test
    public void isSafeAttribute_ReturnsTrueForSafeAttributes() {
        Safelist safelist = Safelist.none();
        String tagName = "img";
        Element el = Mockito.mock(Element.class);
        Attribute attr = Mockito.mock(Attribute.class);
        when(el.getAttribute(0)).thenReturn("image.jpg");
        assertTrue(safelist.isSafeAttribute(tagName, el, attr));
    }

}