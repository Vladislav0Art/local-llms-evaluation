package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestAddAttributes {

    @Test
    public void testAddAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("span", "style='color: blue'");
        Assert.assertTrue(safelist.getEnforcedAttributes("a").get(0).getValue());
        Assert.assertFalse(safelist.getEnforcedAttributes("href").get(0).getValue());
    }

}