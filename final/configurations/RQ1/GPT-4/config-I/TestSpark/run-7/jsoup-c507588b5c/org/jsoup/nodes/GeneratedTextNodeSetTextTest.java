package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextNodeSetTextTest {

    @Test
    public void textNodeSetTextTest() {
        String text = "some text";
        String newText = "new text";
        TextNode tn = new TextNode(text);
        tn.text(newText);
        assertEquals(newText, tn.getWholeText());
    }

}