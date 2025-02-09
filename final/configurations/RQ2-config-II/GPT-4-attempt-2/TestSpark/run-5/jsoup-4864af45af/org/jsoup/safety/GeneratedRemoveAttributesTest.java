package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeAttributes("tag", "attr1", "attr2");
        Assert.assertNotNull(result);
    }

}