package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols("a", "href", "ftp", "http", "https", "mailto");
        Element el = new Element("a");
        el.attr("href", "http://example.com");
        Attribute attr = el.attributes().get("href");
        Assert.assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}