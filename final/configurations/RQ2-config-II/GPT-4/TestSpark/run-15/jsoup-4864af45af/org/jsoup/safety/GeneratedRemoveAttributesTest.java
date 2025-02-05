package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addAttributes("tag1", "a1", "a2");
        safelist.removeAttributes("tag1", "a1");
        Element el = new Element("tag1");
        el.attr("a1", "v1");
        Assert.assertFalse(safelist.isSafeAttribute("tag1", el, new Attribute("a1", "v1")));
    }

}