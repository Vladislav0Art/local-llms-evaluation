package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_GivenTextNode_ReturnsTrueIfBlank {

    @Test
    public void isBlank_GivenTextNode_ReturnsTrueIfBlank() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}