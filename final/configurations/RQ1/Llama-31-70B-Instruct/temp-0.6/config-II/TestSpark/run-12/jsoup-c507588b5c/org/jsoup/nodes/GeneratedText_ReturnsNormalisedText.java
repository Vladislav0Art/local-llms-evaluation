package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedText_ReturnsNormalisedText {

    @Test
    public void text_ReturnsNormalisedText() {
        TextNode textNode = new TextNode("  test  ");
        assertEquals("test", textNode.text());
    }

}