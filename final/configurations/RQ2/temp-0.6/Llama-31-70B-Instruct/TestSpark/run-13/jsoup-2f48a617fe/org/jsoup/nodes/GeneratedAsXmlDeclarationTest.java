package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.asXmlDeclaration()).thenReturn(null);
        assertNull(comment.asXmlDeclaration());
    }

}