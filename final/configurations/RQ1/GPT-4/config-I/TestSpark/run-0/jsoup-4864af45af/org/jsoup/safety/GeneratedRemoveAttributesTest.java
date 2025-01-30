package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeAttributes("img", "src");
        Element img = new Element("img");
        img.attr("src", "http://example.com");
        assertFalse(safelist.isSafeAttribute("img", img, img.attributes().asList().get(0)));
    }

}