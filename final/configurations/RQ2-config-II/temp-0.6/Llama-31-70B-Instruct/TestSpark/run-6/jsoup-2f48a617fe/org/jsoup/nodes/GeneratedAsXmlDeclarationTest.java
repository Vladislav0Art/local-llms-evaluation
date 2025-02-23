package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationTest {

    private Comment comment;

    @Before
    public void init() {
        comment = Mockito.mock(Comment.class);
    }

    @Test
    public void asXmlDeclarationTest() {
        Mockito.when(comment.asXmlDeclaration()).thenReturn(comment);
        assertEquals(comment, comment.asXmlDeclaration());
    }

}