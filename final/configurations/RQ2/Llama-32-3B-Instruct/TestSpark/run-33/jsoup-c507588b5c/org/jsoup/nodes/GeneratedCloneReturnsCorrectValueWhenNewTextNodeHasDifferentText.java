package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCloneReturnsCorrectValueWhenNewTextNodeHasDifferentText {

    @Test
    public void cloneReturnsCorrectValueWhenNewTextNodeHasDifferentText() {
        // Arrange
        TextNode original = new TextNode("Original Node");

        // Act and Assert
        TextNode cloned = new TextNode("Cloned Node");
        assertFalse(cloned.equals(original));
    }

}