package org.jsoup.safety;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "href", "http");
        Element testElement = new Element("a");
        Attribute testAttribute = new Attribute("href", "http://test");
        assertTrue(safelist.isSafeAttribute("a", testElement, testAttribute));
    }

}