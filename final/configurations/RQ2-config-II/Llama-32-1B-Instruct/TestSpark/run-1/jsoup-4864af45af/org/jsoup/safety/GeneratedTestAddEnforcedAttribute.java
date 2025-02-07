package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestAddEnforcedAttribute {

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("a", "class='new-class'", "value='old-value'");
        Element elem = new Element("a");
        elem.attr("class", "new-class");
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertFalse(safelist.isSafeTag("script"));
    }

}