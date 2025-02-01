package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "https");
        safelist.removeProtocols("a", "href", "https");
        Attribute href = new Attribute("href", "https://google.com");
        Element element = new Element("a").attr("href", "https://google.com");
        assertFalse(safelist.isSafeAttribute("a", element, href));
    }

}