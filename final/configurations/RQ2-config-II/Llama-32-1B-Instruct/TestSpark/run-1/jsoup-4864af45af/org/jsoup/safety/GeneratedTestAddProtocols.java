package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestAddProtocols {

    @Test
    public void testAddProtocols() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("a", "rel='stylesheet'");
        Assert.assertTrue(safelist.isSafeAttribute("href", "http://example.com"));
        Assert.assertFalse(safelist.isSafeAttribute("href", "https://example.com"));
    }

}