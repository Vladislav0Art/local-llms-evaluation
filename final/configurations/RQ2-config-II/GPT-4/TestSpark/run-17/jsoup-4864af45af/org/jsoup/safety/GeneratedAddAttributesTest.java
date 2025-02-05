package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.junit.Assert;

import java.util.Set;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element el = new Element("tag1");
        el.attr("attr1", "value1");
        Attribute attr = el.attributes().iterator().next();
        Assert.assertTrue(safelist.isSafeAttribute("tag1", el, attr));
    }

}