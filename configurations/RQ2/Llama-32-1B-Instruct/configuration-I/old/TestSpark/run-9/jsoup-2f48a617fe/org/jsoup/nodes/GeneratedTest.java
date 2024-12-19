package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void testCommentNodeName() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.appendChild(document.createTextNode("This is a sample comment"));
        document.body().appendChild(commentElement);

        assertEquals("comment", commentElement.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("This is a sample comment");
        assertEquals("This is a sample comment", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("This is a sample comment");
        comment.setData("New content");
        assertEquals("New content", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.appendChild(document.createTextNode("This is a sample comment"));
        document.body().appendChild(commentElement);
        commentElement.outerHtmlHead(document, 1, null);

        assertEquals("<!-- This is a sample comment -->", commentElement.outerHtml());
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.appendChild(document.createTextNode("This is a sample comment"));
        document.body().appendChild(commentElement);
        commentElement.outerHtmlTail(document, 1, null);

        assertEquals("<!-- This is a sample comment -->", commentElement.outerHtml());
    }

    @Test
    public void testToString() {
        Comment comment = new Comment("This is a sample comment");
        String expected = "comment";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void testIsXmlDeclaration() {
        Document document = new Document();
        Element commentElement = document.createElement("comment");
        commentElement.appendChild(document.createTextNode("This is a sample comment"));
        commentElement.outerHtmlHead(document, 1, null);
        assertTrue(commentElement.isXmlDeclaration());
    }

    @Test
    public void testGetAsXmlDeclaration() {
        Comment comment = new Comment("This is a sample comment");
        String expected = "<comment>";
        assertEquals(expected, comment.asXmlDeclaration().getValue());
    }

}