package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicReference;

public class GeneratedIsBlankReturnsFalseForNonEmptyText {

    @Test
    public void isBlankReturnsFalseForNonEmptyText() {
        TextNode node = new TextNode("text");
        assertFalse(node.isBlank());
    }
}

public class LeafNodeTest extends TextNodeTest {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }
}

class MockTextNode extends TextNode {
    private String originalText;

    public MockTextNode(String text) {
        super(text);
    }

    public void setOriginalText(String text) {
        this.originalText = text;
    }

    @Override
    protected String text() {
        return originalText;
    }

}