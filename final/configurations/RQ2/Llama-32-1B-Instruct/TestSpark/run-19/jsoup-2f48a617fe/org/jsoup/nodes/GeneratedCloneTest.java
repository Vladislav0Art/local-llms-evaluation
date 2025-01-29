package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment originalComment = new Comment("This is a test comment");
        Comment clonedComment = originalComment.clone();
        assertEquals(originalComment, clonedComment);
    }

}