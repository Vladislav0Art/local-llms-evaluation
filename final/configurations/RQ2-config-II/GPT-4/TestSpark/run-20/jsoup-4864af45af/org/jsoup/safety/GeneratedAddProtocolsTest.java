package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag", "attr", "http", "https");
        Element element = new Element("tag");
        element.attr("attr", "http:value");
        Attribute attribute = element.attributes().iterator().next();
        assertTrue(safelist.isSafeAttribute("tag", element, attribute));
    }

}