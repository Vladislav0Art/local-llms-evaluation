package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testCommentNodeName() {
        // Arrange
        String data = "#comment";

        // Act
        Comment comment = new Comment(data);
        String nodeName = comment.nodeName();

        // Assert
        assertEquals("#comment", nodeName);
    }

    @Test
    public void testGetData() {
        // Arrange
        String data = "#comment";

        // Act
        String result = comment.getData();

        // Assert
        assertEquals(data, result);
    }

    @Test
    public void testCommentSetData() {
        // Arrange
        String data = "#comment";
        Comment comment = new Comment(data);

        // Act
        comment.setData("test");

        // Assert
        assertEquals("test", comment.getData());
    }

    @Test
    public void testOuterHtmlHeadAppendComment() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        comment.outerHtmlHead(accum, depth, out);

        // Assert
        verify(accum, times(1)).append("<!--test-->");
    }

    @Test
    public void testOuterHtmlTailAppendComment() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        comment.outerHtmlTail(accum, depth, out);

        // Assert
        verify(accum, times(1)).append("-->");
    }

    @Test
    public void testIsXmlDeclaration() {
        // Arrange
        String data = "#comment";

        // Act
        boolean result = comment.isXmlDeclaration();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testAsXmlDeclaration() {
        // Arrange
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        XmlDeclaration decl = comment.asXmlDeclaration();

        // Assert
        assertTrue(decl != null);
    }

    private static class MockAppendable implements Appendable {
        @Override
        public void append(CharSequence csq) {
        }

        @Override
        public void append(char c) {
        }

        @Override
        public void append(CharSequence csq, int start, int end) {
        }

        @Override
        public void append(int c) {
        }
    }

}