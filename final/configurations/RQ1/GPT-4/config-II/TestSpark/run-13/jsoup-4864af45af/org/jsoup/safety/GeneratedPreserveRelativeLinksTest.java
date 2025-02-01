package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        safelist.addProtocols("a", "href", "#");
        safelist.preserveRelativeLinks(true);
        Attribute href = new Attribute("href", "#section1");
        Element element = new Element("a").attr("href", "#section1");
        assertTrue(safelist.isSafeAttribute("a", element, href));
    }

}