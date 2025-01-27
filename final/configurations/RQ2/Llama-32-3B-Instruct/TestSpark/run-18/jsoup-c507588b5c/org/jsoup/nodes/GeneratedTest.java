package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void createTextnode_EmptyString_NoException() {
        try {
            new TextNode("");
        } catch (NullPointerException e) {
            fail("Expected no exception");
        }
    }

    @Test
    public void createTextnode_NullString_ThrowsNPE() {
        assertThrows(NullPointerException.class, () -> new TextNode(null));
    }

    @Test
    public void textnode_text_NoException() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.getText());
    }

    public static String getTagName(TextNode node) {
        return node.getTagName();
    }

    @Test
    public void textnodenodeName_SimpleName() {
        TextNode textNode = new TextNode();
        assertEquals("", getTagName(textNode));
    }

    public boolean isSameType(TextNode one, TextNode two) {
        return one instanceof TextNode && two instanceof TextNode;
    }

    @Test
    public void textnode_clone_ReturnsSameType() {
        TextNode textNode1 = new TextNode("test");
        TextNode textNode2 = textNode1.clone();
        assertTrue(isSameType(textNode1, textNode2));
    }

    @Test
    public void textnode_splitText_PartialText() throws IOException {
        TextNode textNode = new TextNode("test");
        String result = textNode.splitText(1);
        assertTrue(result.length() == 1);
    }

    static class AppendableStub implements Appendable {
        StringBuilder sb = new StringBuilder();

        @Override
        public Writer writer() {
            return new StringWriter(sb);
        }
    }

    public void testIsBlank(String input) throws IOException {
        TextNode textNode = new TextNode(input);
        assertTrue(textNode.isBlank());
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

}