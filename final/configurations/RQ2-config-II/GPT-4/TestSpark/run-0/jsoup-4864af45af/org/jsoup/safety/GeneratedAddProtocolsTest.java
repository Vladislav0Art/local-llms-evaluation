package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "https");
        Element element = new Element("a");
        element.attr("href", "https://secure-site.com");
        assertTrue(safelist.isSafeAttribute("a", element, element.attributes().asList().get(0)));
    }

}