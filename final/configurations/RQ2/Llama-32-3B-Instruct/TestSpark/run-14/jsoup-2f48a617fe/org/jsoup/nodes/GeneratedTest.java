package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructorWithDataIsValid() {
        String data = "some comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeName_ReturnsCommentForCommentNode() {
        Document document = new Document();
        Element element = document.createElement("comment");
        Comment comment = new Comment(element);
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData_ReturnsCorrectDataForComment() {
        String originalData = "some comment";
        Document document = new Document();
        Element element = document.createElement("div");
        element.appendChild(document.createComment(originalData));
        Comment comment = new Comment(element);
        assertEquals(originalData, comment.getData());
    }

    @Test
    public void setData_SetsCorrectDataInComment() {
        String originalData = "some comment";
        Document document = new Document();
        Element element = document.createElement("div");
        Comment comment = new Comment(element);
        comment.setData(originalData);
        assertEquals(originalData, comment.getData());
    }

    @Test
    public void clone_ReturnsSameClassForClone() {
        Document document = new Document();
        Element element = document.createElement("comment");
        Comment comment = new Comment(element);
        Comment clonedComment = comment.clone();
        assertSame(Comment.class, clonedComment.getClass());
    }

    @Test
    public void isXmlDeclaration_ReturnsFalseForComment() {
        Document document = new Document();
        Element element = document.createElement("div");
        Comment comment = new Comment(element);
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_ReturnsNullForNonXmlDeclaration() {
        Document document = new Document();
        Element element = document.createElement("div");
        Comment comment = new Comment(element);
        assertNull(comment.asXmlDeclaration());
    }

}