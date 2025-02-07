package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestRelaxed {

    @Test
    public void testRelaxed() {
        Safelist relaxed = new Safelist().relaxed();
        Assert.assertTrue(relaxed.isSafeTag("a"));
        Assert.assertFalse(relaxed.isSafeTag("script"));
        Assert.assertTrue(relaxed.isSafeAttribute("href", "http://example.com"));
        Assert.assertFalse(relaxed.isSafeAttribute("href", "https://example.com"));
    }

}