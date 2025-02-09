package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRemoveAttributesTest {

    @Test
    public void addRemoveAttributesTest() {
        Safelist safelist = new Safelist();
        assertFalse(safelist.isSafeAttribute("div", new Element("div"), new Attribute("class", "test")));

        safelist.addAttributes("div", "class");
        assertTrue(safelist.isSafeAttribute("div", new Element("div"), new Attribute("class", "test")));

        safelist.removeAttributes("div", "class");
        assertFalse(safelist.isSafeAttribute("div", new Element("div"), new Attribute("class", "test")));
    }

}