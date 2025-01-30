package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("div", "class", "test").removeEnforcedAttribute("div", "class");

        Element el = new Element("div").attr("class", "test");
        assertFalse(safelist.isSafeAttribute("div", el, new Attribute("class", "test")));
    }

}