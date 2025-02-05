package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        String tag = "tag";
        safelist.addTags(tag);
        safelist.addAttributes(tag, "attr");
        Attribute attr = new Attribute("attr", "value");
        Assert.assertTrue(safelist.isSafeAttribute(tag, new Element(tag), attr));
    }

}