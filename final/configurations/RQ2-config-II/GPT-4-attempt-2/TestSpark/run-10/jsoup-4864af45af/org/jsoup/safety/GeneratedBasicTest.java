package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        Assert.assertNotNull(safelist);
    }

}