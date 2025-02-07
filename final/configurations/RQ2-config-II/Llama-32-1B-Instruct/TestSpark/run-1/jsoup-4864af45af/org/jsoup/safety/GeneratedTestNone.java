package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedTestNone {

    @Test
    public void testNone() {
        Safelist none = new Safelist();
        Assert.assertTrue(none.isSafeTag("a"));
        Assert.assertFalse(none.isSafeTag("script"));
    }

}