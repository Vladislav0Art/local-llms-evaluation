package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedIsXmlDeclarationTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @After
    public void tearDown() {
        comment = null;
    }

    @Test
    public void isXmlDeclarationTest() {
        assertEquals(false, comment.isXmlDeclaration());
    }

}