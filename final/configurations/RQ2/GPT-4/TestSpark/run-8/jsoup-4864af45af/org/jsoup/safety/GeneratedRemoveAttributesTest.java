package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1", "tag2");
        safelist.addAttributes("tag1", "attr1", "attr2");
        safelist.removeAttributes("tag1", "attr2");

        Element element = new Element("tag1");
        element.attr("attr1", "");
        element.attr("attr2", "");

        Assert.assertTrue(safelist.isSafeAttribute("tag1", element, new Attribute("attr1", "")));
        Assert.assertFalse(safelist.isSafeAttribute("tag1", element, new Attribute("attr2", "")));
    }

}