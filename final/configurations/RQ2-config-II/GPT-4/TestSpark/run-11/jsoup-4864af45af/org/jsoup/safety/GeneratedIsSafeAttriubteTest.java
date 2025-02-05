package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedIsSafeAttriubteTest {

    @Test
    public void isSafeAttriubteTest() {
        String tag = "tag";
        String safeAttribute = "safeAttribute";
        Element element = mock(Element.class);
        Attribute attribute = new Attribute(safeAttribute, "value");
        Safelist safelist = new Safelist().addAttributes(tag, safeAttribute);
        Assert.assertTrue(safelist.isSafeAttribute(tag, element, attribute));
    }

}