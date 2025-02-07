package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestSimpleText {

    @Test
    public void testSimpleText() {
        Safelist simpleText = new Safelist().simpleText();
        Assert.assertTrue(simpleText.isSafeAttribute("href", "http://example.com"));
        Assert.assertFalse(simpleText.isSafeAttribute("href", "https://example.com"));
    }

}