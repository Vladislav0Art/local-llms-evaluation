package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.when(comment.getData()).thenReturn("<?xml version='1.0' encoding='UTF-8'?>");
        assertTrue(comment.isXmlDeclaration());
    }

}