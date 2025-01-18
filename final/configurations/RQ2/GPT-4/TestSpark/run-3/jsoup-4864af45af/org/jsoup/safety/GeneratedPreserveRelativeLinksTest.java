package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.none().preserveRelativeLinks(true);
        Assert.assertTrue(safelist.isPreserveRelativeLinks());
    }

}