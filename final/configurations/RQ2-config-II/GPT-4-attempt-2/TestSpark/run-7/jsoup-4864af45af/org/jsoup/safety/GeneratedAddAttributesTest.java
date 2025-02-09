package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href", "title");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("href")));
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("title")));
    }

}