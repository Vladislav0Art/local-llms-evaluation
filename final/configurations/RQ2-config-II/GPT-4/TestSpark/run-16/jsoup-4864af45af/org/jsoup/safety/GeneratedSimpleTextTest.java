package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist result = Safelist.simpleText();
        Assert.assertNotNull(result);
    }

}