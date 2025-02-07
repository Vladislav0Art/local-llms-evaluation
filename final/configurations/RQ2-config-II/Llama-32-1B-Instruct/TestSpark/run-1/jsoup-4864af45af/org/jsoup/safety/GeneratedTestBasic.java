package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestBasic {

    @Test
    public void testBasic() {
        Safelist basic = new Safelist().basic();
        Assert.assertTrue(basic.isSafeTag("a"));
        Assert.assertTrue(basic.isSafeAttribute("href", "http://example.com"));
        Assert.assertFalse(basic.isSafeAttribute("href", "https://example.com"));
    }

}