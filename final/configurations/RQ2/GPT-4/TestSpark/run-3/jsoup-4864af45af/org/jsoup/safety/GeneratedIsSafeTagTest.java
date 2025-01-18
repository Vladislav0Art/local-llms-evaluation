package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        Safelist safelist = Safelist.none().addTags("div");
        Assert.assertTrue(safelist.isSafeTag("div"));
        Assert.assertFalse(safelist.isSafeTag("p"));
    }

}