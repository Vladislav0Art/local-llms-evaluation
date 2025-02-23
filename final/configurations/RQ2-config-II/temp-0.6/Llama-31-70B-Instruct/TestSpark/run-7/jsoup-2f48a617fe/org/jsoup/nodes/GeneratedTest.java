package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Test Data");
        assertEquals("Test Data", comment.getData());
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("Test Data");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        assertEquals(true, comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals("data", xmlDeclaration.name());
    }

}