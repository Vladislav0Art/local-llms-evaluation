package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);

        Element element = new Element("tag1");
        element.attr("href", "/relative/path");

        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("href", "/relative/path")));
    }

}