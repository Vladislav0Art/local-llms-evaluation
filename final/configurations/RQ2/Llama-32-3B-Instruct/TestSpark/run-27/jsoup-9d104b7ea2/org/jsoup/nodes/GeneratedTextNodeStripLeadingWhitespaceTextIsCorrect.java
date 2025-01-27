package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Text;
import org.junit.Test;

public class GeneratedTextNodeStripLeadingWhitespaceTextIsCorrect {

    @Test
    public void TextNodeStripLeadingWhitespaceTextIsCorrect() {
        TextNode textNode = new TextNode("   Hello World   ");
        String strippedText = textNode.stripLeadingWhitespace();
        assertEquals("Hello World", strippedText);
    }

}