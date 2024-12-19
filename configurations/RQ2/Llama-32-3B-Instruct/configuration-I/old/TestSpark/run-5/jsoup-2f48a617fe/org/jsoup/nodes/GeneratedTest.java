package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedTest {

    @Test
    public void constructorHasCorrectData() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameIsComment() {
        Comment comment = new Comment("Hello World");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataReturnsCorrectData() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void setDataSetsCorrectData() {
        Comment comment = new Comment("Hello World");
        String newData = "This is a new comment";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void cloneCreatesNewComment() {
        Comment comment = new Comment("Hello World");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
    }

    @Test
    public void isXmlDeclarationReturnsFalse() {
        Comment comment = new Comment("Hello World");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNull() {
        Comment comment = new Comment("Hello World");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationSetsAsXmlDeclarationForXMLDeclarations() {
        String xmlDeclaration = "<xml declaration>";
        Comment comment = new Comment(xmlDeclaration);
        XmlDeclaration xmlDeclarationValue = comment.asXmlDeclaration();
        assertNotNull(xmlDeclarationValue);
        assertEquals(xmlDeclaration, xmlDeclarationValue.toString());
    }

}