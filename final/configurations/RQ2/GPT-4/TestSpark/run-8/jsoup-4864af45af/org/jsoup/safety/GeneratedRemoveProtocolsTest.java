package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addProtocols("tag1", "attr1", "http", "https");
        safelist.removeProtocols("tag1", "attr1", "http");

        Element element = new Element("tag1");
        element.attr("attr1", "http://www.example.com");

        Assert.assertFalse(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "http://www.example.com")));
    }

}