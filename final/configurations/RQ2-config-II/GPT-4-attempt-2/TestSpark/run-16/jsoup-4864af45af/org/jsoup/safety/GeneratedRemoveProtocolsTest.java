package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic().removeProtocols("a", "href", "http");
        Element el = new Element("a");
        el.attr("href", "http://www.google.com");
        Attribute attr = el.attributes().get(0);
        assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}