package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedAddEnforcedAttributeTest {

    @Test
    public void addEnforcedAttributeTest() {
        Safelist sl = new Safelist();
        sl.addEnforcedAttribute("tag1", "attr1", "value1");

        Attributes resultAttr = sl.getEnforcedAttributes("tag1");

        Assert.assertEquals(1, resultAttr.size());
        Assert.assertEquals("value1", resultAttr.get("attr1"));
    }

}