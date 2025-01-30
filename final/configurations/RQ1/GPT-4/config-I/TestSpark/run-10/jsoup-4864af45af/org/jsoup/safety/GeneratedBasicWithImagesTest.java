package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        Assert.assertEquals(1, safelist.getEnforcedAttributes("a").size());
        Assert.assertTrue(safelist.isSafeAttribute("a", new Element("a"), new Attribute("rel", "nofollow")));
        Assert.assertTrue(safelist.isSafeTag("img"));
    }

}