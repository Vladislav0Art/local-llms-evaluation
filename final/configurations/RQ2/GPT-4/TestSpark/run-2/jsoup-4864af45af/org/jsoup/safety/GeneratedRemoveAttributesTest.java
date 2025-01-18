package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        safelist.removeAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "http://google.com");
        assertFalse(safelist.isSafeAttribute("a", element, new Attribute("href", "http://google.com")));
    }

}