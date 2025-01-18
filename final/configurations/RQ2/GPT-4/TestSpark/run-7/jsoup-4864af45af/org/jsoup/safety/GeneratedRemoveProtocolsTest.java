package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "http");
        Element mockElem = mock(Element.class);
        when(mockElem.absUrl("href")).thenReturn("http://example.org");
        Attribute attr = new Attribute("href", "http://example.org");
        Assert.assertFalse(safelist.isSafeAttribute("a", mockElem, attr));
    }

}