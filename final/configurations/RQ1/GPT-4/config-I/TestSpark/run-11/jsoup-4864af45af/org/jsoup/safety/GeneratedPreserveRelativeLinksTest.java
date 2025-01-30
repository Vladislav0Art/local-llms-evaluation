package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        safelist.addProtocols("a", "href", "#");
        Element element = new Element("a");
        element.attr("href", "#section1");
        assertTrue(safelist.isSafeAttribute("a", element, element.attributes().asList().get(0)));
    }

}