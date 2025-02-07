package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestAddTags {

    @Test
    public void testAddTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("span", "class='new-class'");
        Assert.assertTrue(safelist.isSafeAttribute("href", "http://example.com"));
        Assert.assertFalse(safelist.isSafeAttribute("href", "https://example.com"));
    }

}