package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedText_GivenNull_ReturnsBlank {

    private TextNode textNode = new TextNode("text");

    @Test
    public void text_GivenNull_ReturnsBlank() {
        when(textNode.text()).thenReturn(null);
        assertTrue(TextNode.normalizeWhitespace(textNode.text()));
    }

}