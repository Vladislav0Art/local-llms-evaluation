package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}