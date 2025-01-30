package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a").addAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "http://test.com");
        assertTrue(safelist.isSafeAttribute("a", element, element.attributes().asList().get(0)));
    }

}