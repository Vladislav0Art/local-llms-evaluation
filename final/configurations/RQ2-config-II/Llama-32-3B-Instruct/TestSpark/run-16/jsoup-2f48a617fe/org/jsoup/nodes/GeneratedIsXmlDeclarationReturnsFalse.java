package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalse {

    @Test
    public void isXmlDeclarationReturnsFalse() {
        // Arrange
        String data = "test comment";

        // Act
        boolean result = comment.isXmlDeclaration(data);

        // Assert
        assertFalse(result);
    }
}

class Appendable {
    @Override
    public void append(CharSequence csq) {
    }

}