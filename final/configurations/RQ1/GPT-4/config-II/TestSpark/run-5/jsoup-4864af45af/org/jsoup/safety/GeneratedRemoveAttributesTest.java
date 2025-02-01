package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "http://www.google.com");
        Attribute attribute = element.attributes().get("href");
        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}