package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNewCommentCloneTest {

    @Test
    public void newCommentCloneTest() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertTrue(comment.isXmlDeclaration());
        assertFalse(clonedComment.isXmlDeclaration());
    }

}