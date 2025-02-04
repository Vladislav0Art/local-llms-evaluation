package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedSplitTextTest {

    @Test
    public void SplitTextTest() {
        String text = "Hello World";
        TextNode originalTextNode = new TextNode(text);
        TextNode tailTextNode = originalTextNode.splitText(6);

        assertEquals(0, originalTextNode.text().length());
        assertEquals("World", tailTextNode.text());
    }

}