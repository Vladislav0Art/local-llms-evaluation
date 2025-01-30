package org.jsoup.safety;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("tag", "attribute");
        Element element = new Element("tag");
        element.attr("attribute", "value");
        Attributes attrs = element.attributes();
        assertTrue(safelist.isSafeAttribute("tag", element, attrs.iterator().next()));
    }

}