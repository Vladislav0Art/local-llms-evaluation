package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("div");
        safelist.addAttributes("div", "id", "class");
        Element element = new Element("div");
        element.attr("id", "testId");
        Attribute attribute = element.attributes().get("id");
        assertTrue(safelist.isSafeAttribute("div", element, attribute));
    }

}