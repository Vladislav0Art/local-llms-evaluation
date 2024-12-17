package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void createComment_GivenData_ReturnsComment() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

    @Test
    public void setComments_Data_GivesCommentCorrectData() {
        Comment comment = new Comment("");
        Comment result = comment.setData("New data");
        assertEquals("New data", result.getData());
    }

    @Test
    public void clone_GivenComment_ReturnsCorrectClone() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment.getData(), cloned.getData());
    }

    @Test
    public void isXmlDeclaration_GivenData_ReturnsTrueIfLooksLikeDeclaration() {
        String data = "!DOCTYPE html";
        boolean result = new Comment(data).isXmlDeclaration();
        assertTrue(result);
    }

    @Test
    public void isXmlDeclaration_GivenData_ReturnsFalseIfNotDeclaration() {
        String data = "This is a comment";
        boolean result = new Comment(data).isXmlDeclaration();
        assertFalse(result);
    }

}