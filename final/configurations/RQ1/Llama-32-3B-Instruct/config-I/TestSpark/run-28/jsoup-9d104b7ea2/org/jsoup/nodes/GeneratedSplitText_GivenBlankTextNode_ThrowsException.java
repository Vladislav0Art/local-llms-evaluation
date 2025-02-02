package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedSplitText_GivenBlankTextNode_ThrowsException {

    @Test
    public void splitText_GivenBlankTextNode_ThrowsException() {
        String text = "";
        TextNode textNode = new TextNode(text);
        try {
            int offset = 1;
            textNode.splitText(offset);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

}