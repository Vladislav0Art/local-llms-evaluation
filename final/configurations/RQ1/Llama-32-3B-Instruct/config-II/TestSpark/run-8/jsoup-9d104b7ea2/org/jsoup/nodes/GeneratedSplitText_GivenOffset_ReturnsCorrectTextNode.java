package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSplitText_GivenOffset_ReturnsCorrectTextNode {

    @Test
    public void splitText_GivenOffset_ReturnsCorrectTextNode() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        int offset = 6;
        TextNode resultTextNode = textNode.splitText(offset);
        assertNotNull(resultTextNode);
        assertEquals(7, resultTextNode.text().length());
    }

}