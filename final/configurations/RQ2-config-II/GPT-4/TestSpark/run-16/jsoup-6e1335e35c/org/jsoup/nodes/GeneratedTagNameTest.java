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
public class GeneratedTagNameTest {

    @Mock
    Tag mockTag;
    @Mock
    Attributes mockAttributes;

    @Test
    public void tagNameTest() {
        String targetTag = "div";
        Element currentEle = new Element(mockTag, "http://example.com", mockAttributes);
        currentEle.tagName(targetTag);

        Assert.assertEquals(targetTag, currentEle.tagName());
    }

}