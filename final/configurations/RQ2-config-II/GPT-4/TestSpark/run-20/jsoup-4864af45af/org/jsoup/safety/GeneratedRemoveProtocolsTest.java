package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag", "attr", "http", "https");
        safelist.removeProtocols("tag", "attr", "http");
        Element element = new Element("tag");
        element.attr("attr", "http:value");
        Attribute attribute = element.attributes().iterator().next();
        assertFalse(safelist.isSafeAttribute("tag", element, attribute));
    }

}