package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedText_GivenText_RetainsOriginalText {

    private TextNode textNode = new TextNode("text");

    @Test
    public void text_GivenText_RetainsOriginalText() {
        when(textNode.text()).thenReturn("original text");
        String actual = textNode.text();
        assertEquals("original text", actual);
    }

}