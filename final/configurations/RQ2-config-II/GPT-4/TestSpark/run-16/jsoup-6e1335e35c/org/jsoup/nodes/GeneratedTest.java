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
public class GeneratedTest {

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

    @Test
    public void attrInvalidKeyTest() {
        Element currentEle = new Element(mockTag, "http://example.com", mockAttributes);
        currentEle.attr(null, "val");
    }

    @Test
    public void attrAddTest() {
        String targetAttrKey = "type";
        String targetAttrVal = "text/css";
        Element currentEle = new Element(mockTag, "http://example.com", mockAttributes);
        currentEle.attr(targetAttrKey, targetAttrVal);

        Assert.assertEquals(targetAttrVal, currentEle.attr(targetAttrKey));
    }

    @Test
    public void tagNameTest() {
        String targetTag = "div";
        Element currentEle = new Element(mockTag, "http://example.com", mockAttributes);
        currentEle.tagName(targetTag);

        Assert.assertEquals(targetTag, currentEle.tagName());
    }

    @Test
    public void siblingElementsTest() {
        Element parentEle = new Element("div");
        Element childEle1 = new Element("p");
        Element childEle2 = new Element("p");
        parentEle.appendChild(childEle1);
        parentEle.appendChild(childEle2);

        Assert.assertEquals(1, childEle1.siblingElements().size());
        Assert.assertEquals(childEle2, childEle1.siblingElements().first());
    }

    @Test
    public void classNamesTest() {
        Element currentEle = new Element("div");
        currentEle.attr("class", "header");
        Assert.assertThat(currentEle.classNames(), hasItem("header"));
    }

    @Test
    public void insertChildrenTest() {
        Element parentEle = new Element("div");
        Element childEle1 = new Element("p");
        Element childEle2 = new Element("p");
        parentEle.appendChild(childEle1);
        parentEle.insertChildren(0, childEle2);
        Assert.assertEquals(childEle2, parentEle.child(0));
    }

}