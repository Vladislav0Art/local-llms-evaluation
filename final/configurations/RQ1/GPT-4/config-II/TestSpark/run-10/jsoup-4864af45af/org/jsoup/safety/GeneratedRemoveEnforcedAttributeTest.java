package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Assert.assertEquals(Safelist.none().removeEnforcedAttribute("a", "rel").toString(), new Safelist().toString());
    }

}