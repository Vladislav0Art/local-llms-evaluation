package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        Assert.assertNotNull(safelist);
    }

}