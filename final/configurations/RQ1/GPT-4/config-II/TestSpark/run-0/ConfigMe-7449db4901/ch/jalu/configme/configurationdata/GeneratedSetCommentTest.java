package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("Path1", "comment1", "comment2");
        commentsConfiguration.setComment("Path2", "comment1", "comment2", "comment3");

        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("Path1", Arrays.asList("comment1", "comment2"));
        expectedComments.put("Path2", Arrays.asList("comment1", "comment2", "comment3"));

        assertEquals(commentsConfiguration.getAllComments(), expectedComments);
    }

}