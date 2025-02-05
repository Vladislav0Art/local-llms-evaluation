package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Assert.assertNotNull(Safelist.relaxed());
    }

}