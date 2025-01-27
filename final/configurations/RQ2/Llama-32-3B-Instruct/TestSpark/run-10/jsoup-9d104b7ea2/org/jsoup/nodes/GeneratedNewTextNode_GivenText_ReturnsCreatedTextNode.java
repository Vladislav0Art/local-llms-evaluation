package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNewTextNode_GivenText_ReturnsCreatedTextNode {

    @Test
    public void newTextNode_GivenText_ReturnsCreatedTextNode() {
        String text = "Hello World";
        TextNode actual = new TextNode(text);
        assertNotNull(actual);
        assertEquals(text, actual.text());
    }

}