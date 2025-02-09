package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist result = Safelist.relaxed();
        Assert.assertNotNull(result);
    }

}