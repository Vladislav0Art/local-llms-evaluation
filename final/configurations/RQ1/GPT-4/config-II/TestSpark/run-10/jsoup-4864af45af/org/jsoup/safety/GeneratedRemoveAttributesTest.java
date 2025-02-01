package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Assert.assertEquals(Safelist.none().removeAttributes("a", "href", "class").toString(), new Safelist().toString());
    }

}