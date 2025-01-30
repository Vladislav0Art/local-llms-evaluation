package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "http");
        Element element = new Element("a");
        element.attr("href", "http://example.com");
        Attributes attrs = element.attributes();
        assertTrue(safelist.isSafeAttribute("a", element, attrs.iterator().next()));
    }

}