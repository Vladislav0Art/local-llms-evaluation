package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);

        Attribute attr = new Attribute("href", "./relative");
        Element el = new Element("a");
        el.attributes().put(attr);

        assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}