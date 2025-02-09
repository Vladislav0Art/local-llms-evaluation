package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http");

        Attribute attr = new Attribute("href", "http://");
        Element el = new Element("a");
        el.attributes().put(attr);

        assertFalse(safelist.isSafeAttribute("a", el, attr));
    }

}