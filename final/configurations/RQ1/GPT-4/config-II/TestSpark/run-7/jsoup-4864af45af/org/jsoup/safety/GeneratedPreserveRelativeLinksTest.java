package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(true);
        Element element = new Element("a");
        Attribute href = new Attribute("href", "/example");
        assertTrue(safelist.isSafeAttribute("a", element, href));
    }

}