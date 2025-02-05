package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Assert.assertNotNull(Safelist.simpleText());
    }

}