package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist result = Safelist.basic();
        Assert.assertNotNull(result);
    }

}