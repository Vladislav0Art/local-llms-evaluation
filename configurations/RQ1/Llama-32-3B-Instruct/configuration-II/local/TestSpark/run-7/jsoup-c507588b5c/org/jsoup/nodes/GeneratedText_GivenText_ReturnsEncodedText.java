package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_GivenText_ReturnsEncodedText {

    @Test
    public void text_GivenText_ReturnsEncodedText() {
        String rawText = "Hello World!";
        TextNode textNode = new TextNode(rawText);
        String encodedText = textNode.text();
        assertTrue(Validate.that(encodedText.contains("&lt;") && encodedText.contains("&gt;")));
    }

}