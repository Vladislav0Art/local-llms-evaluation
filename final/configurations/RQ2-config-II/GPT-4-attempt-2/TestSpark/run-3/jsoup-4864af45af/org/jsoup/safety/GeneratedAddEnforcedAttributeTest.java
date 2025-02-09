package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "attr1", "val1");
        Assert.assertEquals(1, safelist.getEnforcedAttributes("tag1").size());
    }

}