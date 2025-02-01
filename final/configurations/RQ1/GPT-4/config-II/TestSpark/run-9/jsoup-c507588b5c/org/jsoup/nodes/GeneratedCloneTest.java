package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String text = "Sample text";
        TextNode textNode = new TextNode(text);
        TextNode clone = textNode.clone();
        assertEquals(textNode.getWholeText(), clone.getWholeText());
    }

}