package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Assert.assertEquals(Safelist.none().addEnforcedAttribute("a", "rel", "nofollow").toString(), new Safelist().toString());
    }

}