package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.reflect.Method;

public class GeneratedSetCommentShouldAddNewComment {

    @Test
    public void setCommentShouldAddNewComment() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String comment = "new line";
        comments.setComment("path1", comment);
        assertTrue(comments.comments.containsKey("path1"));
        assertEquals(Arrays.asList(comment), comments.comments.get("path1"));
    }

}