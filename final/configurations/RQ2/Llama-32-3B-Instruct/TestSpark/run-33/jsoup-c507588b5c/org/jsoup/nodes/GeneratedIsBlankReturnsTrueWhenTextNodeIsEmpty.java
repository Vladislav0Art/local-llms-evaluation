package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsBlankReturnsTrueWhenTextNodeIsEmpty {

    @Test
    public void isBlankReturnsTrueWhenTextNodeIsEmpty() {
        // Arrange and Act
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}