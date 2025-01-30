package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        Assert.assertEquals(1, safelist.getEnforcedAttributes("a").size());
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("rel", "nofollow")));
    }

}