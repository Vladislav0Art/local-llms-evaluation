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

public class GeneratedSetCommentShouldNotAddEmptyLines {

    @Test
    public void setCommentShouldNotAddEmptyLines() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String[] lines = {"line 1\n", "line2"};
        comments.setComment("path1", lines);
        assertTrue(comments.comments.containsKey("path1"));
        assertEquals(Arrays.asList(lines), comments.comments.get("path1"));
    }

}