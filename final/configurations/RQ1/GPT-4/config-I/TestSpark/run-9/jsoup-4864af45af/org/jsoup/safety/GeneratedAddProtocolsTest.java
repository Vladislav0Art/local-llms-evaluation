package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http", "https");
        safelist.addTags("a");
        Element element = new Element("a");
        element.attr("href", "http://fakeurl.com");
        Assert.assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "http://fakeurl.com")));
        Assert.assertFalse(safelist.isSafeAttribute("a", element, new Attribute("href", "javascript:alert()")));
    }

}