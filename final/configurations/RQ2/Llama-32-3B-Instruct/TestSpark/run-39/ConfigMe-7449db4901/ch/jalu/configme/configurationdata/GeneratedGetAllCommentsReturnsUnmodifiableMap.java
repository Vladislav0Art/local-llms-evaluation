package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsReturnsUnmodifiableMap {

    @Test
    public void getAllCommentsReturnsUnmodifiableMap() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1", "line2"));
        commentsConfig.setComment("path1", "line3");
        Object result = commentsConfig.getAllComments();
        assertTrue(result instanceof java.util.Map);
    }

}