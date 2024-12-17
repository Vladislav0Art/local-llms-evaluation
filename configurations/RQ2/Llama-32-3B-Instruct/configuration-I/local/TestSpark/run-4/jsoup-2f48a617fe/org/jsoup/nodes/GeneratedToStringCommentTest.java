package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.IOException;

public class GeneratedToStringCommentTest {

    @Test
    public void toStringCommentTest() {
        Comment comment = new Comment("This is a comment");
        String expectedOutput = "<!-- This is a comment -->";
        assertEquals(expectedOutput, comment.toString());
    }

}