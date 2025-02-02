package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

public class GeneratedTestAsXmlDeclaration {

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