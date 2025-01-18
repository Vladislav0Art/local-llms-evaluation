package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none().addAttributes("tag1", "attr1", "attr2");
        Element el = mock(Element.class);
        Assert.assertNotNull(safelist.isSafeAttribute("tag1", el, null));
    }

}