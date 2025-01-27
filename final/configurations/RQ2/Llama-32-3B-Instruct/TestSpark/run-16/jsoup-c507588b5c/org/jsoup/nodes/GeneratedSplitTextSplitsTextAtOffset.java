package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextSplitsTextAtOffset {

    @Test
    public void splitTextSplitsTextAtOffset() {
        TextNode textNode = new TextNode("Hello World");
        textNode.splitText(6);
        String[] expectedSplit = {"Hello", "World"};
        assertEquals(expectedSplit, textNode.toString().split(" "));
    }

}