package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        Assert.assertEquals(safelist.getTags().size(), 2);
        Assert.assertEquals(safelist.getAttributes().size(), 0);
        Assert.assertEquals(safelist.getProtocols().size(), 0);
        Assert.assertEquals(safelist.getEnforcedAttributes().size(), 0);
        Assert.assertFalse(safelist.isSafeTag("p"));
        Assert.assertTrue(safelist.isSafeTag("b"));
        Assert.assertTrue(safelist.isSafeTag("i"));
        Assert.assertFalse(safelist.isSafeTag("div"));
    }

}