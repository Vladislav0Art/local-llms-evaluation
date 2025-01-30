package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Assert.assertNotNull(Safelist.relaxed());
    }

}