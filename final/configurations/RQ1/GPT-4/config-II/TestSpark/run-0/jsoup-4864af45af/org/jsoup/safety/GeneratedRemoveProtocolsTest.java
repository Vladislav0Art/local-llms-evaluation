package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addProtocols("a", "href", "http", "https", "ftp");
        safelist.removeProtocols("a", "href", "ftp");
        Element element = new Element("a");
        element.attr("href", "http://www.google.com");
        Attribute attribute = element.attributes().asList().get(0);
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        element.attr("href", "ftp://www.google.com");
        attribute = element.attributes().asList().get(0);
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}