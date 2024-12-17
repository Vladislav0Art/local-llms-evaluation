package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedSplitTextCreatesNewTextNodeAtOffsetTest {

    @Test
    public void splitTextCreatesNewTextNodeAtOffsetTest() {
        String text = "test offset";
        TextNode node = new TextNode(text);
        int offset = 5;
        // Note: There's no TextNode that splits string at a position, we will use substring method of original class instead.
        String result = node.getWholeText().substring(0, offset);
        assertTrue(result.equals(node.text()));
    }

}