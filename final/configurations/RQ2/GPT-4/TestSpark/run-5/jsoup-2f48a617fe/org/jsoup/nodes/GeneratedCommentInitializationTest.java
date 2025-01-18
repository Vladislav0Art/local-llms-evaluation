package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCommentInitializationTest {

    @Test
    public void CommentInitializationTest() {
        Comment comment = new Comment("Test data");
        assertNotNull(comment);
    }

}