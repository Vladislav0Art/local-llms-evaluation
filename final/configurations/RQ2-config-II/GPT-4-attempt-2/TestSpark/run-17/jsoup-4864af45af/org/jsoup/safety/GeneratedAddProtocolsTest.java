package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "ftp");
        assertTrue(safelist.isSafeAttribute("a", new Element("a").attr("href", "ftp://example.com"), new Attribute("href", "ftp://example.com")));
    }

}