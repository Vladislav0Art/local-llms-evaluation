package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestBasicWithImages {

    @Test
    public void testBasicWithImages() {
        Safelist basic = new Safelist().basicWithImages();
        Assert.assertTrue(basic.isSafeTag("img"));
        Assert.assertTrue(basic.isSafeAttribute("src", "http://example.com"));
        Assert.assertFalse(basic.isSafeAttribute("src", "https://example.com"));
    }

}