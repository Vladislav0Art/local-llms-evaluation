package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addAttributes("tag1", "attr1", "attr2");
        Element element = new Element("tag1");
        element.attr("attr1", "value");
        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "value")));
    }

}