package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import java.io.ByteArrayBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void newNodeTextIsEmpty[]

    Test() {
        TextNode textNode = new TextNode("");
        assertEquals("", textNode.text());
    }

    @Test
    public void newNodeTextOnlyWhitespace[]

    Test() {
        TextNode textNode = new TextNode("   ");
        assertEquals("   ", textNode.text());
    }

    @Test
    public void newNodeTextOnlyCharacters[]

    Test() {
        TextNode textNode = new TextNode("abc");
        assertEquals("abc", textNode.text());
    }

    @Test
    public void splitTextOffsetEqualsLengthReturnEmptyTextNode[]

    Test() {
        TextNode textNode = new TextNode("hello");
        TextNode tailNode = textNode.splitText(textNode.text().length());
        assertFalse(tailNode.isBlank());
    }

    @Test
    public void splitTextOffsetGreaterThanLengthThrowException[]

    Test() {
        try {
            new TextNode("hello").splitText(10);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Split offset must not be greater than current text length", e.getMessage());
        }
    }

    @Test
    public void splitTextOffsetLessThanZeroThrowException[]

    Test() {
        try {
            new TextNode("hello").splitText(-1);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Split offset must be not be negative", e.getMessage());
        }
    }

    @Test
    public void cloneReturnsNewTextNode[]

    Test() {
        TextNode textNode = new TextNode("hello");
        TextNode cloned = textNode.clone();
        assertFalse(textNode.isSameNode(cloned));
    }

    @Test
    public void newNodeTextIsBlankWhenEmpty[]

    Test() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void newNodeTextIsBlankWhenWhitespace[]

    Test() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void newNodeTextNotBlankWhenNonEmpty[]

    Test() {
        TextNode textNode = new TextNode("hello");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitTextReturnsNewTextNode[]

    Test() {
        TextNode textNode = new TextNode("hello world");
        TextNode tailNode = textNode.splitText(5);
        assertTrue(tailNode.text().contains("world"));
    }

    @Test
    public void textReturnsNormalisedWhitespace[]

    Test() {
        String normalised = StringUtil.normaliseWhitespace("   ");
        assertEquals(" ", TextNode.stripLeadingWhitespace(normalised));
    }
}

class MockTextNode extends TextNode {
    private boolean isBlank;

    public MockTextNode(String text) {
        super(text);
        this.isBlank = true;
    }

    @Override
    public boolean isBlank() {
        return isBlank;
    }

}