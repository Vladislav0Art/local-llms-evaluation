package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols("img", "src", "http", "https");
        Element element = new Element("img");
        element.attr("src", "http://www.google.com/image.jpg");
        Attribute attribute = element.attributes().get("src");
        assertFalse(safelist.isSafeAttribute("img", element, attribute));
    }

}