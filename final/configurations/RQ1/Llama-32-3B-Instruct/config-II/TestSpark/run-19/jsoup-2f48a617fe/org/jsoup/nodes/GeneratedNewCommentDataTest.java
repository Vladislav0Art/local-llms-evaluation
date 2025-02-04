package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNewCommentDataTest {

    @Test
    public void newCommentDataTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals(comment.getData(), "This is a comment");
    }

}