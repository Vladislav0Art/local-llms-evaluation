package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "class", "id").removeAttributes("div", "class");

        Element el = new Element("div").attr("id", "container").attr("class", "test");
        assertTrue(safelist.isSafeAttribute("div", el, new Attribute("id", "container")));
        assertFalse(safelist.isSafeAttribute("div", el, new Attribute("class", "test")));
    }

}