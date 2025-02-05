package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        Element element = new Element("a");
        element.attr("href", "/relative-url");
        assertTrue(safelist.isSafeAttribute("a", element, element.attributes().asList().get(0)));
    }

}