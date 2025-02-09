package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");

        Element mockElement = mock(Element.class);
        Attribute mockAttribute = mock(Attribute.class);
        when(mockAttribute.getKey()).thenReturn("href");

        assertTrue(safelist.isSafeAttribute("a", mockElement, mockAttribute));
    }

}