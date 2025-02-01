package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Assert.assertEquals(Safelist.simpleText().toString(), Safelist.none().addTags("b", "em", "i", "strong", "u").toString());
    }

}