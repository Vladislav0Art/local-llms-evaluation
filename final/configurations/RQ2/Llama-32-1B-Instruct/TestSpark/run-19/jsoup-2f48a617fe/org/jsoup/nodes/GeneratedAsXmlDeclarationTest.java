package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() throws IOException {
        Comment comment = new Comment("This is a test comment");
        String expectedAsXmlDeclaration = "<!DOCTYPE html><html><head></head><body>Comment</body></html>";
        String actualAsXmlDeclaration = comment.asXmlDeclaration();
        assertEquals(expectedAsXmlDeclaration, actualAsXmlDeclaration);
    }

}