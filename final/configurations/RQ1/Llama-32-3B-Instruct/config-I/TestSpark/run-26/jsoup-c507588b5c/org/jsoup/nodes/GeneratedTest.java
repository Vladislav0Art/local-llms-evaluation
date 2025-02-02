package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void newNodeTextNode() {
        LeafNode newNode = new LeafNode();
        newNode.createFromEncoded("test");
        assertNotNull(newNode);
        assertEquals("#text", newNode.tag());
    }

    @Test
    public void textMethodReturnsCorrectString() {
        LeafNode node = new LeafNode();
        String text = "test";
        node.createElement().append(text).close();
        assertEquals(text, node.text());
    }

    @Test
    public void textMethodReturnsBlankWhenNull() {
        LeafNode node = new LeafNode();
        assertNotNull(node.text());
    }

    @Test
    public void textMethodReturnsBlankWhenWhitespaceOnly() {
        String text = "   ";
        LeafNode node = new LeafNode();
        node.createElement().append(text).close();
        assertEquals("", node.text());
    }

    @Test
    public void splitTextAtOffsetCreatesNewTextNode() throws IOException {
        LeafNode node = new LeafNode();
        String content = "test";
        node.createElement().append(content);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        java.io.PrintWriter pw = new java.io.PrintWriter(baos);
        Document document = new Document();
        document parentNode ().appendChild(node.createElement());
        java.io.Writer writer = Appendable.appending(new LeafNode());
        writer.append(document.outline());
        writer.flush();
        ArrayList<TextNode> children = LeafNode.addChildren(0, node.createElement());
        TextNode cloned = (TextNode) children.get(0);
        assertEquals(content, cloned.text());
    }

    @Test
    public void isBlankReturnsTrueWhenNull() {
        assertTrue(LeafNode.isBlank(""));
    }

    @Test
    public void isBlankReturnsFalseWhenNotEmpty() {
        String text = "test";
        assertTrue(LeafNode.isBlank(text));
    }

    @Test
    public void cloneCreatesSameTextNode() throws CloneNotSupportedException {
        LeafNode node = new LeafNode();
        TextNode cloned = (TextNode) node.clone();
        assertEquals(node, cloned);
    }
}

public class LeafNode {

    public static String tag() {
        return "span";
    }

    public static ArrayList<TextNode> addChildren(int index, java.io.Writer child) throws IOException {
        // implementation of adding children
        return new ArrayList<>();
    }

    public static int siblingIndex() {
        // implementation of getting sibling index
        return 0;
    }
}

public class Document {

    public static Element parentNode() {
        // implementation of getting parent node
        return null;
    }

    public static String outline() {
        // implementation of getting outline
        return "";
    }
}

public class Element {

    public static String tag() {
        return "div";
    }

    public static boolean isBlock() {
        // implementation of being block element
        return true;
    }
}

public class Appendable {

    public static java.io.Writer appending(LeafNode node) throws IOException {
        // implementation of creating writer
        return null;
    }

}