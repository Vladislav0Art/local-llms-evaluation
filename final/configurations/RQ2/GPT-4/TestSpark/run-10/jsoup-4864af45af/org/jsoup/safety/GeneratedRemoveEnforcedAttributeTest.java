package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist sl = new Safelist();
        sl.addEnforcedAttribute("tag1", "attr1", "value1");
        sl.removeEnforcedAttribute("tag1", "attr1");

        Attributes resultAttr = sl.getEnforcedAttributes("tag1");

        Assert.assertEquals(0, resultAttr.size());
    }

}