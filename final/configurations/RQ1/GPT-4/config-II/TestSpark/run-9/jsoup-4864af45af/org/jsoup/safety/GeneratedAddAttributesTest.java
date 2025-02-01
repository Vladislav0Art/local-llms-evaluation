package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("a", "href", "title");
        Attribute attr = new Attribute("href", "https://google.com");
        safelist.isSafeAttribute("a", new Element("a"), attr);
        attr = new Attribute("class", "container");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), attr));
    }

}