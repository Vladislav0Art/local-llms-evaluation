package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        final Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "")));
    }

}