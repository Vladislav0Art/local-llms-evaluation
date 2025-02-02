package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedSplitText_ThrowsExceptionWhenOffsetIsNegative {

    public static String text_ReturnsTextNodeWithUpdatedText(String text) throws IOException {
        TextNode textNode = new TextNode(text);
        textNode = textNode.text("New Text");
        return textNode.text();
    }

    @Test
    public void splitText_ThrowsExceptionWhenOffsetIsNegative() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(-1));
    }

}