package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedText replacement_TreeNode_replacesOldText {

    @Test
    public void text

    replacement_TreeNode_replacesOldText() {
        String originalText = "Hello World";
        String newText = "New Text";
        TextNode node = new TextNode(originalText);
        node.text(newText);
        assertEquals(newText, node.text());
    }

}