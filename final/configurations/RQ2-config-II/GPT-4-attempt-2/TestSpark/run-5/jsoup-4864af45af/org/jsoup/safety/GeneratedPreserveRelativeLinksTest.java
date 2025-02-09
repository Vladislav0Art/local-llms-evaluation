package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.preserveRelativeLinks(true);
        Assert.assertNotNull(result);
        result = safelist.preserveRelativeLinks(false);
        Assert.assertNotNull(result);
    }

}