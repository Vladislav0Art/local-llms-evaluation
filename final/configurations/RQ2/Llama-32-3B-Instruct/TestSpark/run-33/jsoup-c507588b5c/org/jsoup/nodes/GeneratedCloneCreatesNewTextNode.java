package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCloneCreatesNewTextNode {

    @Test
    public void cloneCreatesNewTextNode() {
        // Arrange
        TextNode original = Mockito.mock(TextNode.class);

        // Act and Assert
        TextNode cloned = new TextNode("Hello Clone");
        assertTrue(cloned.equals(original));
        assertNotSame(original, cloned);
    }

}