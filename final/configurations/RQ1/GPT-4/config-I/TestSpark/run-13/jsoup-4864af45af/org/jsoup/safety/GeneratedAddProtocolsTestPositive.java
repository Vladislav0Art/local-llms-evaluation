package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProtocolsTestPositive {

    @Test
    public void addProtocolsTestPositive() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");

        Element el = new Element("a").attr("href", "http://www.example.com");
        assertTrue(safelist.isSafeAttribute("a", el, new Attribute("href", "http://www.example.com")));

        el.attr("href", "https://www.example.com");
        assertTrue(safelist.isSafeAttribute("a", el, new Attribute("href", "https://www.example.com")));
    }

}