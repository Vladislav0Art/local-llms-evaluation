package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("test");
        TextNode splitTextNode = textNode.splitText(1);
        String expected = "t";
        String actual = splitTextNode.getWholeText();
        assertEquals(expected, actual);
    }

}