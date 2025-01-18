package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic().removeAttributes("a", "href");
        Element el = mock(Element.class);
        Assert.assertFalse(safelist.isSafeAttribute("a", el, null));
    }

}