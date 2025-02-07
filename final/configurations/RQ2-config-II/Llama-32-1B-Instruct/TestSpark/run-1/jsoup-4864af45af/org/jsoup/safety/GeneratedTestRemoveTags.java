package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestRemoveTags {

    @Test
    public void testRemoveTags() {
        Safelist safelist = new Safelist();
        safelist.removeTags("span");
        Assert.assertTrue(safelist.isSafeAttribute("href", "http://example.com"));
        Assert.assertFalse(safelist.isSafeAttribute("href", "https://example.com"));
    }

}