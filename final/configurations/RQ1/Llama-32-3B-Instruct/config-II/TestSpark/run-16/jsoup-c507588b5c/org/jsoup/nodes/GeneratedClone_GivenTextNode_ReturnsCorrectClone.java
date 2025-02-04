package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedClone_GivenTextNode_ReturnsCorrectClone {

    @Test
    public void clone_GivenTextNode_ReturnsCorrectClone() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(text, clonedTextNode.text());
    }

}