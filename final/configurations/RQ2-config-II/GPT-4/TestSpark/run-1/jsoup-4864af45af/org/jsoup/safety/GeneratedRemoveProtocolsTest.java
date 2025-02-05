package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist().addTags("a").addProtocols("a", "href", "http", "ftp");
        safelist.removeProtocols("a", "href", "ftp");
        Element element = new Element("a").attr("href", "ftp://example.com");
        assertFalse(safelist.isSafeAttribute("a", element, element.attributes().asList().get(0)));
    }

}