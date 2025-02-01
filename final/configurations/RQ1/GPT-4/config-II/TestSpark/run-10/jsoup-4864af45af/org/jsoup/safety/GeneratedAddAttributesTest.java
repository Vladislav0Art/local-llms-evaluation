package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Assert.assertEquals(Safelist.none().addAttributes("a", "href", "class").toString(), new Safelist().toString());
    }

}