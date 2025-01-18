package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addProtocols("tag1", "attr1", "http", "https");

        Element element = new Element("tag1");
        element.attr("attr1", "http://www.example.com");

        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "http://www.example.com")));
    }

}