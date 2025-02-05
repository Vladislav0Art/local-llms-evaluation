package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Elements;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.TextNode;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAttrAddTest {

    @Mock
    Tag mockTag;
    @Mock
    Attributes mockAttributes;

    @Test
    public void attrAddTest() {
        String targetAttrKey = "type";
        String targetAttrVal = "text/css";
        Element currentEle = new Element(mockTag, "http://example.com", mockAttributes);
        currentEle.attr(targetAttrKey, targetAttrVal);

        Assert.assertEquals(targetAttrVal, currentEle.attr(targetAttrKey));
    }

}