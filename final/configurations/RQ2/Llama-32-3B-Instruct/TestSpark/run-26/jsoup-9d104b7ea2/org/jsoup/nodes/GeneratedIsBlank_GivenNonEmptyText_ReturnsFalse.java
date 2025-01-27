package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedIsBlank_GivenNonEmptyText_ReturnsFalse {

    private TextNode textNode = new TextNode("text");

    @Test
    public void isBlank_GivenNonEmptyText_ReturnsFalse() {
        when(textNode.text()).thenReturn("text");
        assertFalse(textNode.isBlank());
    }

}