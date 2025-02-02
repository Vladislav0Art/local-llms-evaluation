package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_AppendsToOutputString {

    public static String text_ReturnsTextNodeWithUpdatedText(String text) throws IOException {
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        return textNode.text();
    }

    @Test
    public void outerHtmlHead_AppendsToOutputString() throws IOException {
        Appendable output = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlHead(output, 0, null);
        assertEquals("<p>Hello World</p>", output.toString());
    }

}