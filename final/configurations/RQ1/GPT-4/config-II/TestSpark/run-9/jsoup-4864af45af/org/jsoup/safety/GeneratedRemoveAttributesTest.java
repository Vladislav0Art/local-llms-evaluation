package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href", "title");
        safelist.removeAttributes("a", "title");
        Attribute attr = new Attribute("href", "https://google.com");
        assertTrue(safelist.isSafeAttribute("a", new Element("a"), attr));
        attr = new Attribute("title", "Google");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), attr));
    }

}