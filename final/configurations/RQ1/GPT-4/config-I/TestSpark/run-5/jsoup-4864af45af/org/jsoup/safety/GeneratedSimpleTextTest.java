package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Assert.assertNotNull(Safelist.simpleText());
    }

}