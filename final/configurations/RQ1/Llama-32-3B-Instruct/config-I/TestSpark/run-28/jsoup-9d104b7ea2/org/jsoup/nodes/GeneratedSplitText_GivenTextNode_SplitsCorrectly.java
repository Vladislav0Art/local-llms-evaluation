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

public class GeneratedSplitText_GivenTextNode_SplitsCorrectly {

    @Test
    public void splitText_GivenTextNode_SplitsCorrectly() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        int offset = 7;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(7, tailNode.getWholeText().length());
    }

}