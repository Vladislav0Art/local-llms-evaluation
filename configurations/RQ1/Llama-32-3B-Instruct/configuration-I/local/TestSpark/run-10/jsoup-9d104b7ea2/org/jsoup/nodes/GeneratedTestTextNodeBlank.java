package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTestTextNodeBlank {

    @Test
    public void testTextNodeBlank() {
        // Arrange
        // No need to arrange as the creation is straightforward
        TextNode textNode = new TextNode("");

        // Act
        assertTrue(textNode.isBlank());

        // Assert
        assertFalse(textNode.isBlank());
    }
}

class TextNode {
    private String text;

    public TextNode(String text) {
        this.text = text;
    }

    public String nodeName() {
        return "#text";
    }

    public String text() {
        return text;
    }

    public boolean isBlank() {
        return isEmpty();
    }

    public boolean isEmpty() {
        return text == null || text.isEmpty();
    }
}

class AppendableMock {
    public static class Appendable extends java.io.Writer {
        private List<String> lines = java.util.Collections.emptyList();

        @Override
        public void append(CharSequence cs) {
            lines.add(cs.toString());
        }

        @Override
        public void append(CharSequence cs, int start, int end) {
            lines.add(cs.subSequence(start, end).toString());
        }
    }

    public static class AppendableMock.Appendable extends java.io.Writer

    {
        @Override
        public void write ( int c) throws java.io.IOException {
    }

        @Override
        public void write ( char[] pc, int off, int len) throws java.io.IOException {
    }
    }

}