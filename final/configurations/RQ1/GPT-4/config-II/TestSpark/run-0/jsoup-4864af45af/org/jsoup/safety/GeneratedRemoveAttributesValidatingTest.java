package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveAttributesValidatingTest {

    @Test
    public void removeAttributesValidatingTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("a");
        safelist.addAttributes("a", "href", "class");
        safelist.removeAttributes("a", "class");
        Element element = new Element("a");
        element.attr("class", "link");
        Attribute attribute = element.attributes().asList().get(0);
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
        element.attr("href", "www.google.com");
        attribute = element.attributes().asList().get(1);
        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}