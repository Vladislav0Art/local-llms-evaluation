package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        Element el = new Element("a");
        el.attr("href", "/example");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertTrue(safelist.isSafeAttribute("a", el, attr));
    }

}