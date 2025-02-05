package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist result = Safelist.none();
        Assert.assertNotNull(result);
    }

}