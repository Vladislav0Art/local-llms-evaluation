package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedToStringIncludesCommentDataCorrectlyTest {

    @Test
    public void toStringIncludesCommentDataCorrectlyTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals("<!-- This is a comment -->", comment.toString());
    }

}