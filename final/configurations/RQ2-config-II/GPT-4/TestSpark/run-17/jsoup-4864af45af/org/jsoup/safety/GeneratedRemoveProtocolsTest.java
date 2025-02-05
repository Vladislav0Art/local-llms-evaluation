package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}