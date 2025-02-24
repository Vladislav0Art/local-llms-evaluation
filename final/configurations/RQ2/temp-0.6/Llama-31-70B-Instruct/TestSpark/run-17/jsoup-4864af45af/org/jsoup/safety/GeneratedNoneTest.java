package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        Assert.assertEquals(safelist.getTags().size(), 0);
        Assert.assertEquals(safelist.getAttributes().size(), 0);
        Assert.assertEquals(safelist.getProtocols().size(), 0);
        Assert.assertEquals(safelist.getEnforcedAttributes().size(), 0);
        Assert.assertFalse(safelist.isSafeTag("p"));
    }

}