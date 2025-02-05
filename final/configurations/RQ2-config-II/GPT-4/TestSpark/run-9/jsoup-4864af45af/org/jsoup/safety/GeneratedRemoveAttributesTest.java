package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safeList = new Safelist();
        safeList.addAttributes("tag1", "attr1", "attr2");
        safeList.removeAttributes("tag1", "attr1");
        Element mockElement = mock(Element.class);
        Attribute mockAttribute = new Attribute("attr1", "value");
        Assert.assertFalse(safeList.isSafeAttribute("tag1", mockElement, mockAttribute));
    }

}