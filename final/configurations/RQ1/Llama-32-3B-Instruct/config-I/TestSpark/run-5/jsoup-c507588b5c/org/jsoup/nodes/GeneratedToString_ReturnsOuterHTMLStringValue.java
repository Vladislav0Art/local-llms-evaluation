package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToString_ReturnsOuterHTMLStringValue {

    @Test
    public void ToString_ReturnsOuterHTMLStringValue() {
        TextNode textNode = new TextNode("Test");
        String expectedHtml = "<span>Test</span>";
        String actualHtml = textNode.toString();
        assertEquals(expectedHtml, actualHtml);
    }

}