package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "comment line 1";
        String commentLine2 = "comment line 2";
        comments.setComment(path, commentLine1, commentLine2);
        assertEquals(2, comments.comments.get(path).size());
        assertTrue(comments.comments.containsKey(path));
    }

}