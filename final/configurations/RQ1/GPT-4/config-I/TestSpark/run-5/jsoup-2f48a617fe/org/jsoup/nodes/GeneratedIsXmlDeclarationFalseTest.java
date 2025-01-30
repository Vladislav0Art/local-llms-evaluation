package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsXmlDeclarationFalseTest {

    @Test
    public void isXmlDeclarationFalseTest() {
        Comment comment = new Comment("Sample Comment");
        assertFalse(comment.isXmlDeclaration());
    }

}