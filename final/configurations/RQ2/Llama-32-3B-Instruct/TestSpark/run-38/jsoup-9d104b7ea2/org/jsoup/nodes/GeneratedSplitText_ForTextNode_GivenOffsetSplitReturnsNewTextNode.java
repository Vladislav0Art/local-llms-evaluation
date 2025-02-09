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

public class GeneratedSplitText_ForTextNode_GivenOffsetSplitReturnsNewTextNode {

    @Test
    public void splitText_ForTextNode_GivenOffsetSplitReturnsNewTextNode() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = originalText.splitText(6);
        assertEquals(originalText.text(), clonedText.text().substring(0, 5));
    }

}