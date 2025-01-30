package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProtocolsTestNegative {

    @Test
    public void addProtocolsTestNegative() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "https");

        Element el = new Element("a").attr("href", "http://www.example.com");
        assertFalse(safelist.isSafeAttribute("a", el, new Attribute("href", "http://www.example.com")));
    }

}