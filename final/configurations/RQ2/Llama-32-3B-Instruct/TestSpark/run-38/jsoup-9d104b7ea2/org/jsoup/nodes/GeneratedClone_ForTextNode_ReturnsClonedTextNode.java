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

public class GeneratedClone_ForTextNode_ReturnsClonedTextNode {

    @Test
    public void clone_ForTextNode_ReturnsClonedTextNode() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = originalText.clone();
        assertEquals(originalText.getText(), clonedText.getText());
    }

}