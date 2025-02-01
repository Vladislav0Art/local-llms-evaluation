package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Element mockElement = Mockito.mock(Element.class);
        Mockito.when(mockElement.absUrl("href")).thenReturn("https://www.google.com");
        Attribute testAttribute = new Attribute("href", "https://www.google.com");
        AssertassertEquals(false, Safelist.none().isSafeAttribute("a", mockElement, testAttribute));
    }

}