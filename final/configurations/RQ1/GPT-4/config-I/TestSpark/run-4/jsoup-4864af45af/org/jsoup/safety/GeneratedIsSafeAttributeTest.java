package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        final Safelist safelist = Safelist.none().addAttributes("body", "class");
        final Element element = new Element("body").attr("class", "test");
        final Attribute attr = new Attribute("class", "test");
        assertTrue(safelist.isSafeAttribute("body", element, attr));
    }

}