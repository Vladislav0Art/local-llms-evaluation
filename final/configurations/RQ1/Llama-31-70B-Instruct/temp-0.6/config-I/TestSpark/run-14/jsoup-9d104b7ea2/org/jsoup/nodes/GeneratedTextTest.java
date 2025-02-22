package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTextTest {

    private static final String ENCODED_TEXT = "&lt;";
    private static final String DECODED_TEXT = "<";

    private static final String TEXT = "text";

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("text");
        textNode.text("text2");
        assertEquals("text2", textNode.text());
    }

}