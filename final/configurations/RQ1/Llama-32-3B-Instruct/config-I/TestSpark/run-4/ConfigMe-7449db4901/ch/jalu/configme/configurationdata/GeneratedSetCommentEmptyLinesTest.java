package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCommentEmptyLinesTest {

    @Test
    public void setCommentEmptyLinesTest() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String commentLine1 = "\n";
        String commentLine2 = "comment line 2";
        comments.setComment(path, commentLine1, commentLine2);
        assertEquals(1, comments.comments.get(path).size());
    }

}