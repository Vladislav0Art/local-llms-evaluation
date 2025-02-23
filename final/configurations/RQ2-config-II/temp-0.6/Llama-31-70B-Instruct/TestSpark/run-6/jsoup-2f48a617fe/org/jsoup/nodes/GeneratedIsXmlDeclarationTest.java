package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedIsXmlDeclarationTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void isXmlDeclarationTest() {
        Mockito.when(comment.isXmlDeclaration()).thenReturn(true);
        assertEquals(true, comment.isXmlDeclaration());
    }

}