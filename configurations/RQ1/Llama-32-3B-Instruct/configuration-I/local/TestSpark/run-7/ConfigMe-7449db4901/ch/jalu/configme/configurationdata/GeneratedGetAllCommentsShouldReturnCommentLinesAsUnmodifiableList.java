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

public class GeneratedGetAllCommentsShouldReturnCommentLinesAsUnmodifiableList {

    @Test
    public void getAllCommentsShouldReturnCommentLinesAsUnmodifiableList() {
        CommentsConfiguration comments = new CommentsConfiguration();
        comments.setComment("path1", Arrays.asList("line1", "line2"));
        Map<String, List<String>> map = comments.getAllComments();
        assertTrue(map.containsKey("path1"));
        assertEquals(2, ((java.util.List) map.get("path1")).size());
    }

}