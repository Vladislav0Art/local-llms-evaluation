package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestRemoveAttributes {

    @Test
    public void testRemoveAttributes() {
        Safelist safelist = new Safelist();
        safelist.removeAttributes("span", "style='color: blue'");
        Assert.assertTrue(safelist.getEnforcedAttributes("a").isEmpty());
        Assert.assertFalse(safelist.getEnforcedAttributes("href").isEmpty());
    }

}