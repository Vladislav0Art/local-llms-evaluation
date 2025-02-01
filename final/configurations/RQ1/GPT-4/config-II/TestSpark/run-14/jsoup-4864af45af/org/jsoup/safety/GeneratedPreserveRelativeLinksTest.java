package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none();

        safelist.addProtocols("a", "href", "#");
        safelist.preserveRelativeLinks(true);

        Element el = new Element("a");
        el.attr("href", "#section1");

        Assert.assertTrue(safelist.isSafeAttribute("a", el, el.attr("href")));
    }

}