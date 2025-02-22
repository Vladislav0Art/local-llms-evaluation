package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTestIsBlank {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testIsBlank() {
        textNode.text("   ");
        assertTrue("Text node with only whitespace should be blank", textNode.isBlank());
        textNode.text("Text");
        assertFalse("Text node with non-whitespace text should not be blank", textNode.isBlank());
    }

}