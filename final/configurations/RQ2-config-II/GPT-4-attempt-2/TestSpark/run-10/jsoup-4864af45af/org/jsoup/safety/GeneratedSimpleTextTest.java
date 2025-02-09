package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertNotNull(safelist);
    }

}