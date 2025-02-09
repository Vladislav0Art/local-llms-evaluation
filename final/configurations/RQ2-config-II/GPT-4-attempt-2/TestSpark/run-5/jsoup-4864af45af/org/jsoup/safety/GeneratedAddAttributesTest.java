package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.addAttributes("tag", "attr1", "attr2");
        Assert.assertNotNull(result);
    }

}