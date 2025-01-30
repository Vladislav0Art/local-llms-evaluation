package org.jsoup.safety;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestPreserveRelativeLinks {

    @Test
    public void testPreserveRelativeLinks() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        Element element1 = new Element("a");
        Attribute attribute1 = new Attribute("href", "/relativepath");
        element1.attributes().put(attribute1);
        assertTrue(safelist.isSafeAttribute("a", element1, attribute1));
    }

}