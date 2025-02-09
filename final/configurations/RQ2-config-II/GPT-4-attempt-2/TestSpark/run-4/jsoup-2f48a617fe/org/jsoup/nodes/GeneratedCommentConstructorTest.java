package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCommentConstructorTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("Test comment");
        assertNotNull(comment);
        assertEquals("Test comment", comment.getData());
    }

}