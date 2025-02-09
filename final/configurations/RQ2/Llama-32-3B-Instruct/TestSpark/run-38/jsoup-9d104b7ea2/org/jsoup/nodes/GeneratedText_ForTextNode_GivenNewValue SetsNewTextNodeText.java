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

public class GeneratedText_ForTextNode_GivenNewValue SetsNewTextNodeText {

    @Test
    public void text_ForTextNode_GivenNewValue

    SetsNewTextNodeText() {
        String newText = "New Hello World";
        TextNode textNode = new TextNode(newText);
        textNode.setText(newText);
        assertEquals(newText, textNode.getText());
    }

}