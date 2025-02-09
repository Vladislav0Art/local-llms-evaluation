package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Appendable;

public class GeneratedIsBlank_ForTextNode_GivenNonEmptyText_ReturnsFalse {

    @Test
    public void isBlank_ForTextNode_GivenNonEmptyText_ReturnsFalse() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}