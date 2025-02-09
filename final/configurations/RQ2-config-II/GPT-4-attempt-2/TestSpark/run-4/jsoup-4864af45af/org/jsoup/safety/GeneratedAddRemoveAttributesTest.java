package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRemoveAttributesTest {

    @Test
    public void addRemoveAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element element = Mockito.mock(Element.class);
        Attribute attribute = new Attribute("attr1", "value");
        assertTrue(safelist.isSafeAttribute("tag1", element, attribute));
        safelist.removeAttributes("tag1", "attr1", "attr2");
        assertFalse(safelist.isSafeAttribute("tag1", element, attribute));
    }

}