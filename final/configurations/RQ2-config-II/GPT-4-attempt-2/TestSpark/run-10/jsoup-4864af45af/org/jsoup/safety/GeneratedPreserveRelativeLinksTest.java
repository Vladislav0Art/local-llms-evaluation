package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist = safelist.preserveRelativeLinks(true);
        Assert.assertNotNull(safelist);
    }

}