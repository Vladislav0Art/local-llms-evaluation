package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        String[] removeProtocols = {"http", "https"};
        safelist = safelist.removeProtocols("a", "href", removeProtocols);
        Element el = new Element("a");
        el.attr("href", "/relative/link");
        Attribute attr = el.attributes().get(0);
        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}