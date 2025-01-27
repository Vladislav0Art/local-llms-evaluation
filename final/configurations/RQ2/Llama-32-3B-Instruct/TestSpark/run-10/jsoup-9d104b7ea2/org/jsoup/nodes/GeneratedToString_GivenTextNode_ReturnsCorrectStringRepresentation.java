package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedToString_GivenTextNode_ReturnsCorrectStringRepresentation {

    @Test
    public void toString_GivenTextNode_ReturnsCorrectStringRepresentation() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        String expected = "<text>Hello World</text>";
        assertEquals(expected, node.toString());
    }

}