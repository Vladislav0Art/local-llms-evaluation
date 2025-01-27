package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTextnode_text_NoException {

    @Test
    public void textnode_text_NoException() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getText());
    }

    public static String getTagName(TextNode node) {
        return node.getTagName();
    }

}