package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    public Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some data");
    }

    @Test
    public void isXmlDeclarationTest() {
        boolean expected = false;
        boolean actual = comment.isXmlDeclaration();
        assertEquals(expected, actual);
    }

}