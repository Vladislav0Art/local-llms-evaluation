package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("img", "src", "http", "https");
        Element element = new Element("img");
        element.attr("src", "http://www.google.com/image.jpg");
        Attribute attribute = element.attributes().get("src");
        assertTrue(safelist.isSafeAttribute("img", element, attribute));
    }

}