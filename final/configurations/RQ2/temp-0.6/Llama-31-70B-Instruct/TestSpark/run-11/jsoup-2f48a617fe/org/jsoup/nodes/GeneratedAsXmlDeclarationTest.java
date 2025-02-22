package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    public Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some data");
    }

    @Test
    public void asXmlDeclarationTest() {
        XmlDeclaration expected = null;
        XmlDeclaration actual = comment.asXmlDeclaration();
        assertEquals(expected, actual);
    }

}