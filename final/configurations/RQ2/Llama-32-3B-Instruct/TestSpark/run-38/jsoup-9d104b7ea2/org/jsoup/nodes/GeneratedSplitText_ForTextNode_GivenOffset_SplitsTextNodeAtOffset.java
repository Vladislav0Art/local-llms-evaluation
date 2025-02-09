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

public class GeneratedSplitText_ForTextNode_GivenOffset_SplitsTextNodeAtOffset {

    @Test
    public void splitText_ForTextNode_GivenOffset_SplitsTextNodeAtOffset() {
        String text = "Hello\nWorld";
        TextNode textNode = new TextNode(text);
        StringBuilder expectedTextBeforeSplit = new StringBuilder("Hello");
        StringBuilder expectedTextAfterSplit = new StringBuilder("World");
        textNode.splitText(0).splitText(6);
        assertEquals(expectedTextBeforeSplit.toString(), ((TextNode) textNode.before().text()).toString());
        assertEquals(expectedTextAfterSplit.toString(), ((TextNode) textNode.after().text()).toString());
    }

}