package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "class", "id");

        Element el = new Element("div").attr("id", "container").attr("class", "test").attr("style", "color:red");
        assertTrue(safelist.isSafeAttribute("div", el, new Attribute("id", "container")));
        assertTrue(safelist.isSafeAttribute("div", el, new Attribute("class", "test")));
        assertFalse(safelist.isSafeAttribute("div", el, new Attribute("style", "color:red")));
    }

}