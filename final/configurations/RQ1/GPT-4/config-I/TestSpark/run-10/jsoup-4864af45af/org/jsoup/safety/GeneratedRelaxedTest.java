package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertFalse(safelist.isSafeAttribute("p", new Element("p"), new Attribute("style", "color: red")));
        Assert.assertTrue(safelist.isSafeTag("div"));
    }

}