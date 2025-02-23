package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTextNode_createFromEncoded_returnsTextNodeWithUnencodedText {

    @Test
    public void TextNode_createFromEncoded_returnsTextNodeWithUnencodedText() {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.text());
    }

}