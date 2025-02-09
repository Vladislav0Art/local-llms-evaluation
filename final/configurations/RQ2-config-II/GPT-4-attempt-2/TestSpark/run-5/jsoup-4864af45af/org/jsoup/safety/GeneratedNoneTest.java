package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist result = Safelist.none();
        Assert.assertNotNull(result);
    }

}