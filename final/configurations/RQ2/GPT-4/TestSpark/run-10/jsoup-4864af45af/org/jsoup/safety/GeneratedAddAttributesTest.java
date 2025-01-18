package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist sl = new Safelist();
        sl.addAttributes("tag1", "attr1", "attr2");

        Attribute attr = new Attribute("attr1", "value");
        Element element = mock(Element.class);
        when(element.nodeName()).thenReturn("tag1");

        Assert.assertTrue(sl.isSafeAttribute("tag1", element, attr));
    }

}