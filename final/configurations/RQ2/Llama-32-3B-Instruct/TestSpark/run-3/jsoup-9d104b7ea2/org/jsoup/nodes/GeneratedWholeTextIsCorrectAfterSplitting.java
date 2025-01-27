package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedWholeTextIsCorrectAfterSplitting {

    @Test
    public void wholeTextIsCorrectAfterSplitting() throws IOException {
        TextNode node = new TextNode("Hello World");
        TextNode clonedNode = node.splitText(5);
        String wholeText = clonedNode.getWholeText();
        assertTrue(wholeText.contains("World"));
    }

}