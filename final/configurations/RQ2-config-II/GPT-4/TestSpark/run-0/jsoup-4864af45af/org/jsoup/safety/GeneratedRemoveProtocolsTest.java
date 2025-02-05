package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.removeProtocols("a", "href", "https");
        Element element = new Element("a");
        element.attr("href", "https://secure-site.com");
        assertFalse(safelist.isSafeAttribute("a", element, element.attributes().asList().get(0)));
    }

}