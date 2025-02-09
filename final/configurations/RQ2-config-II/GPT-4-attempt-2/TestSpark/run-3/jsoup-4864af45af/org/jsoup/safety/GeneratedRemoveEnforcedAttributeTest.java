package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("tag1");
        safelist.addEnforcedAttribute("tag1", "attr1", "val1");
        safelist.removeEnforcedAttribute("tag1", "attr1");
        Assert.assertEquals(0, safelist.getEnforcedAttributes("tag1").size());
    }

}