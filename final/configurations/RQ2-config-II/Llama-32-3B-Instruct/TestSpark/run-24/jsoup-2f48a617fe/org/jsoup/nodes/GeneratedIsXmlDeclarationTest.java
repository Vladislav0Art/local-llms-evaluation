package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
        // assertion code here
    }

}