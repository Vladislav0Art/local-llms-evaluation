package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = new Safelist();
        safelist.preserveRelativeLinks(true);
        Assert.assertFalse(safelist.preserveRelativeLinks(false));
    }

}