package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "ftp", "http", "https", "mailto");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().get("href");
        Assert.assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}