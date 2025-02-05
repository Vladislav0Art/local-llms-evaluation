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
public class GeneratedBaseUriTest {

    @Mock
    Tag mockTag;
    @Mock
    Attributes mockAttributes;

    @Test
    public void baseUriTest() {
        String testUri = "http://example.com/";
        Element currentEle = new Element(mockTag, testUri, mockAttributes);
        Assert.assertEquals(testUri, currentEle.baseUri());

        TextNode txNode = new TextNode("name", testUri);
        Element newEle = new Element("<html><head><title>Test Page</title></head></html>", testUri);
        newEle.appendChild(txNode);
        Assert.assertEquals(testUri, txNode.baseUri());
    }

}