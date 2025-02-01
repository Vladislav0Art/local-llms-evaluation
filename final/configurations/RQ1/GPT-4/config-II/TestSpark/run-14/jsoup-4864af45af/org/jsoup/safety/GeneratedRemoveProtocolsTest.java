package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "https");
        safelist.removeProtocols("a", "href", "https");

        Element el = new Element("a");
        el.attr("href", "https://google.com");

        Assert.assertFalse(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

}