package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    public Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some data");
    }

    @Test
    public void getDataTest() {
        String expected = "Some data";
        String actual = comment.getData();
        assertEquals(expected, actual);
    }

    @Test
    public void setDataTest() {
        String expected = "New data";
        comment.setData("New data");
        String actual = comment.getData();
        assertEquals(expected, actual);
    }

    @Test
    public void outerHtmlHeadTest() {
        String expected = "Some data";
        String actual = comment.outerHtml();
        assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String expected = "Some data";
        String actual = comment.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void cloneTest() {
        Comment expected = comment;
        Comment actual = comment.clone();
        assertEquals(expected, actual);
    }

    @Test
    public void isXmlDeclarationTest() {
        boolean expected = false;
        boolean actual = comment.isXmlDeclaration();
        assertEquals(expected, actual);
    }

    @Test
    public void asXmlDeclarationTest() {
        XmlDeclaration expected = null;
        XmlDeclaration actual = comment.asXmlDeclaration();
        assertEquals(expected, actual);
    }

}