package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        safelist.addTags("a");
        safelist.addAttributes("a", "href");
        Element element = new Element("a");
        element.attr("href", "./relative/url");
        Assert.assertTrue(safelist.isSafeAttribute("a", element, new Attribute("href", "./relative/url")));
    }

}