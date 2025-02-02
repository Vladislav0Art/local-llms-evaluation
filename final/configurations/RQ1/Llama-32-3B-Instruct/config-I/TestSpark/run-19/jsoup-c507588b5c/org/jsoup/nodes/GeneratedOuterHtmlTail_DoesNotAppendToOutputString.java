package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_DoesNotAppendToOutputString {

    public static String text_ReturnsTextNodeWithUpdatedText(String text) throws IOException {
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        return textNode.text();
    }

    @Test
    public void outerHtmlTail_DoesNotAppendToOutputString() {
        Appendable output = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(output, 0, null);
        assertEquals("", output.toString());
    }

}