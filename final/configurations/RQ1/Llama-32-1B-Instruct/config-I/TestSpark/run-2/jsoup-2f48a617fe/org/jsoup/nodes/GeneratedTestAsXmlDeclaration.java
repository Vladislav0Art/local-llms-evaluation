package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.jupiter.api.Test;

public class GeneratedTestAsXmlDeclaration {

    private Document document = new Document();
    private ParseSettings parseSettings = new ParseSettings();

    public void testCreateComment() {
        comment = new Comment("This is a sample comment");
    }

    public void testGetData() {
        assertEquals("This is a sample comment", comment.getData());
    }

    public void testSetData() {
        comment.setData("New content here");
        assertEquals("New content here", comment.getData());
    }

    @Test
    public void testAsXmlDeclaration() throws Exception {
        Comment comment2 = new Comment(getData());
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertEquals(comment2, xmlDecl);
    }

}