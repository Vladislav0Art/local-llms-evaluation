package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();
        safelist.preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("<a href='http://www.google.com'></a>"), new Attribute("href", "http://www.google.com")));
    }

}