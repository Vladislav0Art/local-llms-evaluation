package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();

        safelist
                .preserveRelativeLinks(true)
                .addProtocols("a", "href", "#");

        String href = "#section1";
        Element el = new Element("a").attr("href", href);

        assertTrue(safelist.isSafeAttribute("a", el, new Attribute("href", href)));

        // test with preserveRelativeLinks=false (default)
        safelist = new Safelist().addProtocols("a", "href", "#");
        assertFalse(safelist.isSafeAttribute("a", el, new Attribute("href", href)));
    }

}