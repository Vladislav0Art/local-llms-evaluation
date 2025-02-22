package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

public class GeneratedTestIsBlank {

    private TextNode textNode;
    private static final String VALID_TEXT = "This is a valid text";
    private static final String INVALID_TEXT = "This is an invalid text";

    @Before
    public void setUp() {
        textNode = new TextNode(VALID_TEXT);
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

}