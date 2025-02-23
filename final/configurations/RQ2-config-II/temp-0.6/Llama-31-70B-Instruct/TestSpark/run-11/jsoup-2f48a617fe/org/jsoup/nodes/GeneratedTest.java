package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        String nodeName = comment.nodeName();
        assertEquals("#comment", nodeName);
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        String data = comment.getData();
        assertEquals("data", data);
    }

    @Test
    public void setDataTest() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        boolean isXmlDeclaration = comment.isXmlDeclaration();
        assertTrue(isXmlDeclaration);
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("!data");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}