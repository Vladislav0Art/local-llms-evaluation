package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        safelist.removeAttributes("a", "href");
        Element mockElem = mock(Element.class);
        Attribute attr = new Attribute("href", "http://example.org");
        Assert.assertFalse(safelist.isSafeAttribute("a", mockElem, attr));
    }

}