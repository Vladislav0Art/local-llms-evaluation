package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentWithEmptyLineResultingInNoCommentMarker {

    @Test
    public void setCommentWithEmptyLineResultingInNoCommentMarker() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("", "line2"));
        commentsConfig.setComment("path1", "");
        assertEquals(3, ((Map) commentsConfig.getAllComments()).size());
    }

}