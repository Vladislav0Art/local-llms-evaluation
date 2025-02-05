package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist().addAttributes("p", "class");
        Element el = Mockito.mock(Element.class);
        Attribute attr = Mockito.mock(Attribute.class);
        Mockito.when(attr.getKey()).thenReturn("class");

        assertTrue(safelist.isSafeAttribute("p", el, attr));
    }

}