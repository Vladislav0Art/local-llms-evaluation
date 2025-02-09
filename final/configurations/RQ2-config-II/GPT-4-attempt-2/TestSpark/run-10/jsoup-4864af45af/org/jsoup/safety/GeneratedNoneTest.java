package org.jsoup.safety;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Attributes;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        Assert.assertNotNull(safelist);
    }

}