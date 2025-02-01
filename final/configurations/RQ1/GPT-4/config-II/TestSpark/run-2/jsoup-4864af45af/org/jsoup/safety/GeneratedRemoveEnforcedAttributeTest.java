package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().removeEnforcedAttribute("a", "rel");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("rel", "nofollow");

        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}