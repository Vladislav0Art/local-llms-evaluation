package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p");
        safelist.addAttributes("p", "style");

        Assert.assertTrue(safelist.isSafeAttribute("p", new Element("p"), new Attribute("style", "color: red")));
    }

}